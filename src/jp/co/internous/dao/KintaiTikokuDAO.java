/**
 *
 */
package jp.co.internous.dao;


/**
 * 全画面に入力された値を引きだし、resultを返すメソッド
 * @author Sanshiro Kocho
 * @since 2015/06/23
 * @return result
 */
public class KintaiTikokuDAO {

	public insert(String number, String name,String reason){

		DBconnector con = new DBconnector();
		String sql = "insert into kesseki (number,name,reaon) VALUES (?,?,?)";
	       try{
	           PreparedStatement ps = con.prepareStatement(sql);
	           ps.setString(1,@@@@@@@@@@);
	           ps.setString(2,@@@@@@@@@@@@);
	           ps.setString(3,@@@@@@@@@@@@);

	       }catch (SQLException e) {
	           e.printStackTrace();
	        }finally{
	            try{
	                con.close();
	            }catch (SQLException e){
	                   e.printStackTrace();
	            }
	        }
	       return;
	  }
