package com.internousdev.openconnect.projects.action;

import com.internousdev.openconnect.projects.dao.ProjectsDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectsDeleteAction {


		/**
		 * 画面で受け取ったIDを元にして、DBの情報を削除する為のクラス
		 * @author YUICHI KIRIU
		 * @since 2016/09/08
		 * @version 1.0
		 */
		public class ProjectProgressDeleteAction extends ActionSupport{
			/**
			 * シリアルバージョンID
			 */
			private static final long serialVersionUID = -758470450L;
			/**
			 * プロジェクトID
			 */
			private int projectId;
			/**
			 * 実行メソッド DAOにデータを渡して、結果を返す
			 * @author YUICHI KIRIU
			 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
			 */
			public String execute(){
				ProjectsDeleteDAO dao = new ProjectsDeleteDAO();
				String result = ERROR;
				int count = 0;
				count = dao.delete(projectId);
				if(count > 0){
					result = SUCCESS;
				}
				return result;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return
			*/
			public int getProjectId() {
				return projectId;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param
			*/
			public void setProjectId(int projectId) {
				this.projectId = projectId;
			}


	}

}
