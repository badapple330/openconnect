package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dao.DecisionDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.openconnect.projects.dao.ProjectsSelectDAO;
import com.internousdev.openconnect.projects.dto.ProjectsSelectDTO;
import com.internousdev.openconnect.students.dao.StudentsSelectDAO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁状況一覧のDBの情報を検索するクラス
 * @author KENICHI HORIGUCHI,KOUHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionSelectAction extends ActionSupport{
	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 6053714239083263231L;
	/**
	 *@author KENICHI HORIGUCHI
	 *決裁一覧
	 */
	private ArrayList <DecisionDTO> decisiontList = new ArrayList <DecisionDTO>();
	/**
	 * プロジェクトリスト
	 */
	private List<ProjectsSelectDTO> projectsList = new ArrayList<ProjectsSelectDTO>();
	/**
	 * 生徒一覧
	 */
	private List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();
	/**
	 *結果表示
	 * @author KENICHI HORIGUCHI
	 */
	private String resultSelect = "該当する情報は存在しません。";
	/**
	 * 検索文
	 * @author KENICHI HORIGUCHI
	 */
	private String searchString = "";
	/**
	 * 検索の実行メソッド
	 * @author KENICHI HORIGUCHI
	 */
	public String execute(){
		DecisionDAO dao = new DecisionDAO();
		ProjectsSelectDAO projectsDao = new ProjectsSelectDAO();
		StudentsSelectDAO studentsDao = new StudentsSelectDAO();



		if (dao.select(searchString)) {
			decisiontList = dao.getList();
			if(searchString.equals("")){
				resultSelect ="すべてを表示しました。";
			} else {
				resultSelect = searchString + " を検索しました。";
			}
			} else {
				resultSelect = (getText("該当する情報はありません。"));
			}

			projectsList = projectsDao.select("");
			studentsList = studentsDao.select("");

			return SUCCESS;
		}
		/**
		 * 取得メソッド 決裁状況リスト
		 * @author KENICHI HORIGUCHI
		 * @return decisiontList
		 */
		public ArrayList <DecisionDTO> getDecisiontList() {
			return decisiontList;
		}


		/**
		 * 設定メソッド
		 * @author KENICHI HORIGUCHI
		 * @param decisiontList
		 */
		public void setDecisiontList(ArrayList <DecisionDTO> decisiontList) {
			this.decisiontList = decisiontList;
		}


		/**
		 * 取得メソッド エラーメッセージ
		 * @author KENICHI HORIGUCHI
		 * @return resultSelect
		 */
		public String getResultSelect() {
			return resultSelect;
		}


		/**
		 * 設定メソッド
		 * @author KENICHI HORIGUCHI
		 * @param resultSelect
		 */
		public void setResultSelect(String resultSelect) {
			this.resultSelect = resultSelect;
		}


		/**
		 * 取得メソッド 検索文
		 * @author KENICHI HORIGUCHI
		 * @return searchString
		 */
		public String getSearchString() {
			return searchString;
		}


		/**
		 * 設定メソッド
		 * @author KENICHI HORIGUCHI
		 * @param searchString
		 */
		public void setSearchString(String searchString) {
			this.searchString = searchString;
		}


		/**
		 * 取得メソッド シリアルID
		 * @author KENICHI HORIGUCHI
		 * @return serialVersionUID
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		/**
		 *   取得メソッド プロジェクトリストを取得する
		 * @author MASAHIRO KEDSUKA
		 * @param projectsList セットする projectsList
		 */
		public List<ProjectsSelectDTO> getProjectsList() {
			return projectsList;
		}
		/**
		 *   格納メソッド プロジェクトリストを格納する
		 * @author MASAHIRO KEDSUKA
		 * @param projectsList セットする projectsList
		 */
		public void setProjectsList(List<ProjectsSelectDTO> projectsList) {
			this.projectsList = projectsList;
		}
		/**
		 * 取得メソッド
		 * @author MASAHIRO KEDSUKA
		 * @return studentsList セットする studentsList
		 */
		public List<StudentsDTO> getStudentsList() {
			return studentsList;
		}
		/**
		 * 設定メソッド
		 * @author MASAHIRO KEDSUKA
		 * @param studentsList セットする studentsList
		 */
		public void setStudentsList(List<StudentsDTO> studentsList) {
			this.studentsList = studentsList;
		}



	}
