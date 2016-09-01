/**
 *
 */
package com.internousdev.openconnect.booklist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.booklist.dto.BooklistSearchDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class BooklistSearchDAO {


	 public List<BooklistSearchDTO> searchList = new ArrayList<BooklistSearchDTO>();



	    public List<BooklistSearchDTO> select(String search) {
	        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
	                "mysql");
	        Connection con = db.getConnection();

	        try {
	            String sql = "SELECT*FROM book_list WHERE title LIKE '%" + search + "%'";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	            	BooklistSearchDTO dto = new BooklistSearchDTO();

	            	dto.setBookId(rs.getInt("book_id"));
	            	dto.setTitle(rs.getString("title"));

	                searchList.add(dto);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return searchList;
	    }



}
