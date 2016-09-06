package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.dto.LoginOauthDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * Oauthでログインに必要な情報を取得するDAOクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class LoginOauthDAO{

    /**
     * データベースから取得した情報を格納する為の変数
     */
    private LoginOauthDTO dto = new LoginOauthDTO();

    /**
     * <p>
     * openconnectデータベースに接続し、取得したoauthIdとoauthNameが<br>
     * userテーブルに登録されているか判定するためのメソッド<br>
     * 登録されていればユーザーIDをDTOに格納します。<br>
     * </p>
     * @param oauthId OAuthサービス元のユニークID
     * @param oauthName OAuthサービス元のユーザー名
     * @return true/false 登録されていればtrueを返し、登録されていなければfalseを返します。
     */
    public boolean select(String oauthId, String oauthName){
        Connection con = DBConnector.getConnection("openconnect");
        try{
            String sql = "SELECT id FROM user WHERE oauth_id=? AND oauth_name=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,oauthId);
            ps.setString(2,oauthName);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                dto.setId(rs.getInt("id"));
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 初回ログイン時にopenconnectデータベースに接続し、userテーブルにユーザー情報を登録できるか確認するメソッド
     * @param oauthId OAuthサービス元のユニークID
     * @param userName OAuthサービス元のユーザー名
     * @param oauthName OAuthサービス元の名前
     * @param email OAuthのサービス元で登録しているメールアドレス
     * @return count インサートする件数を返します。
     */
    public int insert(String userName, String email, String oauthId, String oauthName ) {
        int count = 0;
        Connection con = DBConnector.getConnection("openconnect");
        String sql = "INSERT INTO user(user_name, email, oauth_id, oauth_name) values (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, oauthId);
            ps.setString(4, oauthName);
            int result = ps.executeUpdate();
            if(result > 0){
                count = result;
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
        return count;
    }

    /**
     * データベースから取得した情報を格納する為の変数を取得するメソッド
     * @return dto データベースから取得した情報を格納する為の変数
     */
    public LoginOauthDTO getLoginOauthDTO() {
        return dto;
    }

    /**
     * データベースから取得した情報を格納する為の変数を格納するメソッド
     * @param dto データベースから取得した情報を格納する為の変数
     */
    public void setLoginOauthDTO(LoginOauthDTO dto) {
        this.dto = dto;
    }

}