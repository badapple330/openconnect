package jp.co.internous.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.GetStudentsDAO;
import jp.co.internous.dto.GetStudentsDTO;
/**
 * InsertAction 管理者画面から生徒一覧を取得する為のアクション
 * @author SHIORI OYAMA
 * @since 2016/06/23
 * @version 1.0
 */
public class GetStudentsAdminAction extends ActionSupport {

	private List<GetStudentsDTO> studentsList = new ArrayList<GetStudentsDTO>();
	/**
	 * 取得した情報をListに格納し、resultを返すメソッド
	 * @author SHIORI OYAMA
	 * @since 2016/06/23
	 * @return result
	 * @see GetStudentsDAO
	 */
	public String execute(){
		String result = ERROR;
		GetStudentsDAO dao = new GetStudentsDAO();
		try {
			studentsList.addAll(dao.select());
			result = SUCCESS;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * リスト取得メソッド
	 * @author SHIORI OYAMA
	 * @since 2016/06/23
	 * @return studentsList
	 */
	public List<GetStudentsDTO> getStudentsList() {
		return studentsList;
	}

}
