/**
 *
 */
package com.internousdev.prototype1607.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.prototype1607.dto.LoginDTO;
import com.internousdev.prototype1607.util.DBConnector;

/**
 * @author internous
 *
 */
public class LoginDAO {
	public LoginDTO select(String name,String password){    //()の中は引数を入力する

		DBConnector db =new DBConnector();       //SQLに接続する為にDBConnectorをインスタンス化を行う
		Connection con =db.getConnection();        //dbに代入されたConnectorをconに代入する
		LoginDTO dto =new LoginDTO();

		//sql select文を記述 入力された値をDBと照合する
		String sql="select*from user where user_name=? and password=?";    //条件がある場合はwhereを使う
		//select文をString型でsqlに代入している。
		try{
			PreparedStatement ps =con.prepareStatement(sql);           //sqlに代入した値を使ってデータベースへ接続する為、変数名に格納する

			ps.setString(1, name);                              //int型で変数にidをsetする：例）変数 1.setString(1,email);
			ps.setString(2,password);                         //String型で変数にpasswordをsetする ：例）変数1,setString(2,password);
			//1が一つ目の"?"に入る値、2が二つ目の"?"に入る値

			ResultSet rs=ps.executeQuery();              //例）ResultSet 変数2= 変数1.executeQuery();
			//変数1の値が2つとも取得できたらexecuteQuery(実行)し、変数2に以下の処理で取得した値を代入する


			if(rs.next()){          //変数2に入っている値を使ってnextでデータベース内を一列ずつ読み取っていく
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));  //dto.setDTOで宣言しているメンバー変数(変数2.get データ型("カラム名"));
				//例)dto.setUserName(re.getString("user_name"));     setのあとの変数は大文字から始まる
				//String型で指定したカラムのデータを取得し変数2に入れ、DTOのメンバー変数に格納している
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		try{
			con.close();                        //処理を終わる場合はDBConnectorを終了させる
		}catch(SQLException e){
			e.printStackTrace();
		}

		return dto;           //結果をDTOに返す 例)return 変数
	}


}


