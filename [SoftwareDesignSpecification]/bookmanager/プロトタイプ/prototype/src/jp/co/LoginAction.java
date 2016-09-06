package jp.co;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String name;
	private String password;

	public String execute() {

		String ret = ERROR;
		Connection con = null;

			//mysqlに入力された値を照会させる処理
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","mysql");

			String sql = "select * from test_table";
			sql += " where user_name = ?";
			sql += " and password = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ret = SUCCESS;
			}

		}catch (Exception e) {
			ret = ERROR;
		}finally{
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {

				}
			}
		}
		return ret;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
