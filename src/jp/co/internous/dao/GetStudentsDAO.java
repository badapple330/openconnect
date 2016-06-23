package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.dto.GetStudentsDTO;
import jp.co.internous.util.DBconnector;

public class GetStudentsDAO {

    public List<GetStudentsDTO> select() throws SQLException {
        List<GetStudentsDTO> studentsList = new ArrayList<GetStudentsDTO>();
        Connection con = DBconnector.getConnection();

        try {
            String sql = "select * from students";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GetStudentsDTO dto = new GetStudentsDTO();
                dto.setNumber(rs.getString(1));
                dto.setName(rs.getString(2));
                dto.setSymbol(rs.getString(3));
                dto.setEntrance(rs.getString(4));
                studentsList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
        }

        return studentsList;
    }
}