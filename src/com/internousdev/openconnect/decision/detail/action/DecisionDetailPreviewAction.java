package com.internousdev.openconnect.decision.detail.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailPreviewDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDownloadDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionDetailPreviewAction extends ActionSupport {
	/**
	 * ID
	 */
	private int decisionDetailId;
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList = new ArrayList<DecisionDetailDTO>();
	/**
	 * ダウンロードリスト
	 */
	private List<DecisionDetailDownloadDTO> downloadList = new ArrayList<DecisionDetailDownloadDTO>();
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		DecisionDetailPreviewDAO dao = new DecisionDetailPreviewDAO();

		 decisionDetailList = dao.select(decisionDetailId);
		if ( decisionDetailList.size() > 0 ) {

			getFile( decisionDetailList.get(0).getDecisionId(), decisionDetailList.get(0).getProjectName(), decisionDetailList.get(0).getDecisionType() );
		}
		return SUCCESS;
	}
	/**
	 * 実行メソッド この決裁のファイルを取得
	 * @author KOHEI NITABARU
	 * @param decicionId, projectName, decisionType
	 */
	private void getFile( int decisionId, String projectName, String decisionType ){

		String destPath = System.getProperty("user.home") + File.separator + "temp" + File.separator;

		File targetDir = new File( destPath );

		File[] fileList = targetDir.listFiles();

		if( fileList == null ) return;

		String searchStr = "【" + decisionType + "】" + projectName + "_";

		for( int i=0; i<fileList.length; i++ ){

			if( !fileList[i].getName().startsWith(searchStr) ) continue;

			DecisionDetailDownloadDTO dto = new DecisionDetailDownloadDTO();

			dto.setFileUrl( fileList[i].getAbsolutePath() );
			dto.setFileName( fileList[i].getName() );

			downloadList.add( dto );
		}
	}

	/**
	* 取得メソッド リスト形式の決裁手続きを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailList
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	* 設定メソッド リスト形式の決裁手続きを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailList
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}
	/**
	* 取得メソッド 決裁手続きIDを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailId
	*/
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド 決裁手続きIDを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailId
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
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
	* 取得メソッド ダウンロードリストを取得
	* @author KOHEI NITABARU
	* @return downloadList
	*/
	public List<DecisionDetailDownloadDTO> getDownloadList() {
		return downloadList;
	}
	/**
	* 設定メソッド ダウンロードリストを設定
	* @author KOHEI NITABARU
	* @param downloadList
	*/
	public void setDownloadList(List<DecisionDetailDownloadDTO> downloadList) {
		this.downloadList = downloadList;
	}

}
