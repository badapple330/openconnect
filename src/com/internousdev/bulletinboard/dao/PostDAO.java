package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.PostDTO;
import com.internousdev.bulletinboard.util.DBConnector;

/**
 * チャット取得、格納に関するクラス
 * @author Ryo Maeda
 * @since 2017/06/05
 * @version 1.0
 *
 */
public class PostDAO {



	/**
	 * 送信者ID
	 */
	private int senderId;
	/**
	 * 受取人ID
	 */
	private int receiverId=0;
	/**
	 * グループID
	 */
	private int groupId=0;
	/**
	 * 送信内容
	 */
	private String postContents="";
	/**
	 * 添付画像
	 */
	private String img="";


	/*
	 * チャット送信用のコンストラクタ(グループ、1対1兼用）
	 */
	public PostDAO(int senderId,int receiverId,int groupId,String postContents,String img){
		this.senderId=senderId;
		this.receiverId=receiverId;
		this.groupId=groupId;
		this.postContents=postContents;
		this.img=img;
		if(img==null){
			this.img="";
		}
	}

	/*
	 * チャット読み込み用のコンストラクタ(ユーザーId,相手のId,グループId）
	 */
	public PostDAO(int senderId,int receiverId,int groupId){
		this.senderId=senderId;
		this.receiverId=receiverId;
		this.groupId=groupId;
	}


	  public ArrayList<PostDTO> postGet(){

		    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		    Connection con = db.getConnection();
		    Connection con2= db.getConnection();
		    Connection con3 = db.getConnection();
		    ArrayList<PostDTO> postList = new ArrayList<PostDTO>();

		    int k=0;
		    String sql;
		    String sql2="select * from read_flg where post_id=? and user_id=?";
		    String sql3="insert into read_flg values(?,?)";

		    if(groupId !=0){
		    	 sql = "select * from users join post on users.user_id=post.sender_id where group_id=? order by post_at asc";
		    	 k=1;
		    }
		    else if(receiverId != 0){
		    	sql = "select * from users join post on users.user_id=post.sender_id where (sender_id=? or receiver_id=?) and (sender_id=? or receiver_id=?) order by post_at asc";
		    	k=2;
		    }
		    else{sql="";}

		    try{
		    	PreparedStatement ps = con.prepareStatement(sql);

		    	if(k==1){
		    		ps.setInt(1,groupId);
		    	}
		    	if(k==2){
		    		ps.setInt(1,senderId);
		    		ps.setInt(2,senderId);
		    		ps.setInt(3,receiverId);
		    		ps.setInt(4,receiverId);

		    	}
		    	ResultSet rs = ps.executeQuery();
		    	while(rs.next()){
		    		PostDTO dto = new PostDTO();
		    		dto.setPostId(rs.getInt("post_id")); //投稿ID
		    		dto.setReceiverId(rs.getInt("receiver_id")); //受取人ID
		    		dto.setSenderId(rs.getInt("sender_id")); //送信者ID
		    		dto.setSenderName(rs.getString("user_name"));//送信者名
		    		dto.setSenderImg(rs.getString("user_img"));//送信者画像
		    		dto.setGroupId(rs.getInt("group_id"));
		    		dto.setPostContents(rs.getString("post_contents")); //送信内容
		    		dto.setImg(rs.getString("img")); //添付画像
		    		if((dto.getImg())==null){
		    			dto.setImg("");
		    		}
		    		dto.setPostAt(rs.getString("post_at")); //投稿日時

		    		PreparedStatement ps2 = con2.prepareStatement(sql2);
		    		ps2.setInt(1,dto.getPostId());
		    		ps2.setInt(2,senderId);
		    		ResultSet rs2= ps2.executeQuery();
		    		while (rs2.next()){
		    			dto.setReadFlg(1);//既読情報
		    		}
		    		if(dto.getReadFlg()==0){//既読がついてない場合に既読をつける
		    			PreparedStatement ps3 = con3.prepareStatement(sql3);
		    			ps3.setInt(1,dto.getPostId());
		    			ps3.setInt(2,senderId);
		    			ps3.executeUpdate();
		    		}


		    		postList.add(dto);

		    	}
		    }catch(SQLException e){
		    	e.printStackTrace();
		    }finally {
				try{
					con.close();
				}catch(Exception e){
					e.printStackTrace();
					}
			}
		     return postList;
		  }


	  public int postSet(){
		    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		    Connection con = db.getConnection();

		    int inserted=0;
		    int k=0;
		    String sql="";

		    if(groupId !=0){
		    	 sql = "insert into post (sender_id,group_id,post_contents,img) values (?,?,?,?)";
		    	 k=1;
		    }
		    else if(receiverId != 0){
		    	sql = "insert into post (sender_id,receiver_id,post_contents,img) values (?,?,?,?) ";
		    	k=2;
		    }

		    try{
		    	PreparedStatement ps = con.prepareStatement(sql);

		    	if(k==1){
		    		ps.setInt(1,senderId);
		    		ps.setInt(2,groupId);
		    		ps.setString(3,postContents);
		    		ps.setString(4,img);
		    	}
		    	if(k==2){
		    		ps.setInt(1,senderId);
		    		ps.setInt(2,receiverId);
		    		ps.setString(3,postContents);
		    		ps.setString(4,img);
		    	}
		    	inserted= ps.executeUpdate();

		    	ps.close();
		    }catch(SQLException e){
		    	e.printStackTrace();
		    }finally {
				try{
					con.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		return inserted;
		}

}
