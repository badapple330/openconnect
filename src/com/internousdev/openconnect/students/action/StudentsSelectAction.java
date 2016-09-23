package com.internousdev.openconnect.students.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsSelectDAO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBから受講生一覧を取得し表示するクラス
 * @author KOHEI NITABARU
 * @since 2016/09/07
 */
public class StudentsSelectAction extends ActionSupport {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 214651219760554487L;
	/**
	 * 生徒リスト
	 */
	private List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();
	/**
	 * 検索文字
	 */
	private String searchString = "";
	/**
	 * 結果文字
	 */
	private String resultSelect = "該当する情報はありません。";

	/**
	 * 実行メソッド 受講生一覧を表示
	 * @author KOHEI NITABARU
	 * @return result
	 */
	public String execute(){

		String result = ERROR;
		StudentsSelectDAO dao = new StudentsSelectDAO();
		studentsList = dao.select(searchString);

		if (studentsList.size() != 0) {
			result = SUCCESS;
			resultSelect = "検索結果を表示しました。";
			sort();
		}

		return result;
	}

	/**
	 * 実行メソッド ソート
	 * @author MINORI SUNAGAWA
	 */
	private void sort(){

		if( studentsList.size() == 1 ) return;

		boolean isSort = false;

		int i = 0;

		while( i < studentsList.size() - 1 ){

			isSort = false;

			for( int j=i+1; j<studentsList.size(); j++ ){

				String date1 = studentsList.get(i).getYear() + studentsList.get(i).getMonth();
				String date2 = studentsList.get(j).getYear() + studentsList.get(j).getMonth();

				if( Integer.parseInt( date1 ) < Integer.parseInt( date2 ) ){

					StudentsDTO dto = studentsList.get(i);
					studentsList.remove(i);
					studentsList.add( dto );
					isSort = true;

					break;
				}
			}

			if( isSort ) continue;

			i++;
		}
	}

	/**
	 * 取得メソッド 受講生リストを取得
	 * @author KOHEI NITABARU
	 * @return studentsList
	 */
	public List<StudentsDTO> getStudentsList() {
		return studentsList;
	}

	/**
	 * 設定メソッド 受講生リストを設定
	 * @author KOHEI NITABARU
	 * @param studentsList
	 */
	public void setStudentsList(List<StudentsDTO> studentsList) {
		this.studentsList = studentsList;
	}

	/**
	 * 取得メソッド 検索文字を取得
	 * @author KOHEI NITABARU
	 * @return search
	 */
	public String getSearchString() {
		return searchString;
	}

	/**
	 * 設定メソッド 検索文字を設定
	 * @author KOHEI NITABARU
	 * @param search
	 */
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	/**
	 * 取得メソッド シリアル番号を取得
	 * @author KOHEI NITABARU
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 取得メソッド 結果文字を取得
	 * @author KOHEI NITABARU
	 * @return resultSelect
	 */
	public String getResultSelect() {
		return resultSelect;
	}

	/**
	 * 設定メソッド 結果文字を設定
	 * @author KOHEI NITABARU
	 * @param resultSelect
	 */
	public void setResultSelect(String resultSelect) {
		this.resultSelect = resultSelect;
	}

}

