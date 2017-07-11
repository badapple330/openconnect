package com.internousdev.bulletinboard.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.util.db.mysql.MySqlConnector;



public class FriendSearchDAO {


        //userNameで検索されたusers情報をallListに格納
		public ArrayList<UserDTO> select(String userName) {
			Connection con = new MySqlConnector("openconnect").getConnection();

			String SearchName= "%"+ userName + "%";

			ArrayList<UserDTO> allList = new ArrayList<UserDTO>();

			/*1 自分のフォロワーをselect
			String sql1 ="select followed_id from follows where follower_id =?";
			/*2 自分のフォロワー以外のfollowed_idをselect
			String sql2 ="select distinct followed_id from follows where followed_id not in (?)";
			/*3 ↑で取得したfollowed_idで条件にし、users情報をselect + LIKEでuserName検索
			String sql3 ="select distinct users.*, follows.followed_id from users inner join follows on users.user_id=follows.followed_id where followed_id in (?) && user_name  LIKE ?"; */


			String sql ="select * from users where user_name LIKE ? ";

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, SearchName);
				ResultSet rs = ps.executeQuery();
				while (rs.next()){
					UserDTO dto = new UserDTO();
					dto.setUserId(rs.getInt("user_id"));
					dto.setUserName(rs.getString("user_name"));
					dto.setUserIcon(rs.getString("user_icon"));
					dto.setUserLevel(rs.getInt("user_level"));
					allList.add(dto);
				}
			}

			 catch (SQLException e ) {
			   e.printStackTrace() ;
			} finally {
				try{
					con.close();
			}catch(SQLException e){
				e.printStackTrace();

		}
			}
			return allList;

			}


		public ArrayList<UserDTO> check(int userId) {
			Connection con = new MySqlConnector("openconnect").getConnection();

			ArrayList<UserDTO>checkList = new ArrayList<UserDTO>();


			String sql ="select followed_id from follows where follower_id=?";

			try{
				PreparedStatement ps = con.prepareStatement(sql) ;
				ps.setInt(1, userId);
				ResultSet rs = ps.executeQuery();
				while (rs.next()){
					UserDTO dto = new UserDTO();
					dto.setFollowedId(rs.getInt("followed_id"));

					checkList.add(dto);
				}
			}

			 catch (SQLException e ) {
			   e.printStackTrace() ;
			} finally {
				try{
					con.close();
			}catch(SQLException e){
				e.printStackTrace();

		}
			}
			return checkList;

			}

		}
