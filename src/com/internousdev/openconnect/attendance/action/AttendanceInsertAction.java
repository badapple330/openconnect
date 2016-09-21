/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.internousdev.openconnect.attendance.dao.AttendanceInsertDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceCalendarDTO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA、KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceInsertAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 671961516965709160L;

	/**
	 * 追加する年
	 */
	private String year = "";
	/**
	 * 追加する月
	 */
	private String month = "";
	/**
	 * カレンダー
	 */
	private Calendar cal;
	/**
	 * 今月のカレンダー
	 */
	private Calendar thisCal;
	/**
	 * 結果文字
	 */
	private String resultString = "追加に失敗しました。";

	/**
	 * 実行メソッド 勤怠管理のDB
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		String result = ERROR;

		setThisCalendar();

		for( int i=0; i<3; i++){

			if( insertUsers( cal ) ){

				result = SUCCESS;
				resultString = "追加に成功しました";
			}

			cal.add( Calendar.MONTH, -1 );
		}

		return result;
	}

	/**
	 * 実行メソッド 今月のカレンダーを設定
	 * @author MINORI SUNAGAWA
	 */
	private void setThisCalendar(){

		// DateFormat
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		Date dt = null;

		try{

			// Dateオブジェクト作成
			dt = df.parse(year + "-" + month + "-01");

		}catch( Exception e ){
			e.printStackTrace();
		}

		// カレンダークラスのインスタンスを取得
		cal = Calendar.getInstance();

		// 現在時刻を設定
		cal.setTime(dt);
	}

	/**
	 * 実行メソッド 今月のカレンダーを設定
	 * @author MINORI SUNAGAWA
	 */
	private void setThisMonth(){

		// DateFormat
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		Date dt = null;

		try{

			// Dateオブジェクト作成
			dt = df.parse(year + "-" + month + "-01");

		}catch( Exception e ){
			e.printStackTrace();
		}

		// カレンダークラスのインスタンスを取得
		thisCal = Calendar.getInstance();

		// 現在時刻を設定
		thisCal.setTime(dt);
	}

	/**
	 * 実行メソッド カレンダーを年月日に分けて文字列で設定
	 * @author MINORI SUNAGAWA
	 */
	private AttendanceCalendarDTO getCalendarString( Calendar cal ){

		AttendanceCalendarDTO dto = new AttendanceCalendarDTO();

		dto.setYear( cal.get(Calendar.YEAR) );
		dto.setMonth( cal.get(Calendar.MONTH) + 1 );
		dto.setDay( cal.get(Calendar.DATE) );

		dto.setYearString( String.valueOf( dto.getYear() ) );
		dto.setMonthString( String.valueOf( dto.getMonth() ) );
		dto.setDayString( String.valueOf( dto.getDay() ) );

		if( dto.getMonth() < 10 ) dto.setMonthString( "0" + String.valueOf( dto.getMonth() ) );
		if( dto.getDay() < 10 ) dto.setDayString( "0" + String.valueOf( dto.getDay() ) );

		return dto;
	}

	/**
	 * 実行メソッド 渡したカレンダーの月の受講生を追加
	 * @author MINORI SUNAGAWA
	 */
	private boolean insertUsers( Calendar cal ){

		boolean result = false;

		AttendanceInsertDAO dao = new AttendanceInsertDAO();

		AttendanceCalendarDTO dto = getCalendarString( cal );

		ArrayList<StudentsDTO> usersList = new ArrayList<StudentsDTO>();

		usersList = dao.select( dto.getYearString(), dto.getMonthString() );

		setThisMonth();

		dto = getCalendarString( thisCal );

		String thisMonth = dto.getMonthString();

		while( thisMonth.equals( dto.getMonthString() ) ){

			for( int i=0; i<usersList.size(); i++ ){

				if( dao.check( dto.getYearString() + dto.getMonthString() + dto.getDayString(), usersList.get(i).getUserId() ) ) continue;

				dao.insert( dto.getYearString() + dto.getMonthString() + dto.getDayString() , usersList.get(i).getUserId() );
			}

			thisCal.add(Calendar.DATE, 1);
			dto = getCalendarString( thisCal );

			result = true;
		}




		return result;
	}

	/**
	 * 取得メソッド シリアル番号を取得
	 * @author MINORI SUNAGAWA
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	* 取得メソッド 受講年を取得
	* @author MINORI SUNAGAWA
	* @return year
	*/
	public String getYear() {
		return year;
	}

	/**
	* 設定メソッド 受講年を設定
	* @author MINORI SUNAGAWA
	* @param year
	*/
	public void setYear(String year) {
		this.year = year;
	}

	/**
	* 取得メソッド 受講月を取得
	* @author MINORI SUNAGAWA
	* @return month
	*/
	public String getMonth() {
		return month;
	}

	/**
	* 設定メソッド 受講月を設定
	* @author MINORI SUNAGAWA
	* @param month
	*/
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	* 取得メソッド カレンダーを取得
	* @author MINORI SUNAGAWA
	* @return cal
	*/
	public Calendar getCal() {
		return cal;
	}

	/**
	* 設定メソッド カレンダーを設定
	* @author MINORI SUNAGAWA
	* @param cal
	*/
	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	/**
	* 取得メソッド 今月のカレンダーを取得
	* @author MINORI SUNAGAWA
	* @return thisCal
	*/
	public Calendar getThisCal() {
		return thisCal;
	}

	/**
	* 設定メソッド  今月のカレンダーを設定
	* @author MINORI SUNAGAWA
	* @param thisCal
	*/
	public void setThisCal(Calendar thisCal) {
		this.thisCal = thisCal;
	}

	/**
	* 取得メソッド 結果文字を取得
	* @author KENICHI HORIGUCHI
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* 設定メソッド  結果文字を設定
	* @author KENICHI HORIGUCHI
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}


}
