/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author Takahiro Adachi
 * @since 1.0
 */
public class GroupMemberDAO {
	public ArrayList<UserDTO> select(int groupId) {
		Connection con = new MySqlConnector("openconnect").getConnection();
		ArrayList<UserDTO> memberList = new ArrayList<UserDTO>();

		String sql = "SELECT groups.user_id, user_img, user_name, profile FROM groups INNER JOIN users "
				+ "ON groups.user_id = users.user_id WHERE group_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, groupId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				UserDTO dto = new UserDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserImg(rs.getString("user_img"));
				dto.setProfile(rs.getString("profile"));
				dto.setUserName(rs.getString("user_name"));
				memberList.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return memberList;
	}

}
