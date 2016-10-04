package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dto.GetAddressDTO;
import com.internousdev.util.DBConnector;

/**
 * AdminReviewDAO レビュー情報に接続する為のクラス
 *
 * @author YUKI MAEDA
 * @since 2016/08/18
 * @version 1.0
 */
public class SearchResultDAO {

    /**
     * 抽出メソッド ログインした際にDBからサイト情報をリスト化して抽出し、DTOに格納する
     *
     * @author YUKI MAEDA
     * @return articleList 抽出に成功したらSUCCESS、失敗したらERROR
     */
    public List<GetAddressDTO> articleList = new ArrayList<GetAddressDTO>();

    private String summary;

    public List<GetAddressDTO> select(String summary) {
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "rewrite", "root",
                "mysql");
        Connection con = db.getConnection();

        try {
            String sql = "SELECT site_date,summary,site_janre,site_Banner,image_url,site_title FROM article WHERE summary LIKE '%" + summary + "%'";
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, summary);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	GetAddressDTO dto = new GetAddressDTO();
            	dto.setSiteJanre(rs.getString("site_date"));
            	dto.setSiteJanre(rs.getString("summary"));
                dto.setSiteJanre(rs.getString("site_janre"));
                dto.setSiteBanner(rs.getString("site_Banner"));
                dto.setImageUrl(rs.getString("image_url"));
                dto.setSiteTitle(rs.getString("site_title"));


                articleList.add(dto);
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
        return articleList;
    }

    /**
     * @return articleList
     */
    public List<GetAddressDTO> getArticleList() {
        return articleList;
    }

    /**
     * @param articleList セットする articleList
     */
    public void setArticleList(List<GetAddressDTO> articleList) {
        this.articleList = articleList;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary セットする summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

}