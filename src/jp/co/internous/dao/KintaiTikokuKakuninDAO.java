/**
 *
 */
package jp.co.internous.dao;

import com.mysql.jdbc.PreparedStatement;
import jp.co.internous.util.DBconnector;

/**
 * @author internous
 *
 */
public class KintaiTikokuKakuninDAO {


	//ユーザー情報を追加させる為のメソッド
	public insert(String number, String name,String reason){
		/*
		 * 以下SQLへデータを登録する為のインサート文
		 * table名は[tikoku]
		 */
	 	DBconnector con = new DBconnector();
		String sql = "insert into kesseki (number,name,reaon) VALUES (?,?,?)";
       try{
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,@@@@@@@@@@);
           ps.setString(2,@@@@@@@@@@@@);
           ps.setString(3,@@@@@@@@@@@@);

       }catch (SQLException e) {
       	System.out.println("SQLExceptionが発生しました");
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

}