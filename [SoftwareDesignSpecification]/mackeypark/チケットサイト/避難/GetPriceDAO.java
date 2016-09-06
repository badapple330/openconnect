package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.GetPriceDTO;
import com.internousdevwork.mackeypark.util.DBConnector;;

/**
 * MySQLのデータを取得する為のクラス
 * @author MOTONORI TATESHITA
 * @since 1.0
 * @version 1.0
 */
public class GetPriceDAO {

    /**
     * 値段一覧情報を格納するリスト
     */
    private ArrayList<GetPriceDTO> selectList = new ArrayList<>();

    /**
     * MySQLのデータを取得する為のメソッド
     * @param designArray
     * @param dBperiod
     * @param ticketArray
     * @param selectList2
     * @return result 取得できたらリストに格納してtrue、できなかったらfalseを返します。
     */
    public boolean selectMySQL(String ticketArray, String dBperiod) {


        boolean result = false;

        Connection connection = ( Connection )DBConnector.getConnection("park");
        String sql = "select price from ticket where item_name = '"+dBperiod+"("+ticketArray+")' group by item_name";
        GetPriceDTO dto = new GetPriceDTO();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                dto.setPrice(rs.getString("price"));
                selectList.add(dto);
                result = true;
            }
            System.out.println(dto.getPrice());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 値段リストを取得する為のメソッド
     * @return selectList 値段ーリスト
     */
    public ArrayList<GetPriceDTO> getSelectList() {
        return selectList;
    }

    /**
     * ユーザーリストを格納する為のメソッド
     * @param selectList 値段リスト
     */
    public void setSelectList(ArrayList<GetPriceDTO> selectList) {
        this.selectList = selectList;
    }
}