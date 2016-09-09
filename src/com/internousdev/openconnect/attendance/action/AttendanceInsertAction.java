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
import com.internousdev.openconnect.students.dto.StudentsSearchDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
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
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		setThisCalendar();

		for( int i=0; i<3; i++){

			insertUsers( cal );

			cal.add( Calendar.MONTH, -1 );
		}

		return SUCCESS;
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
	private void insertUsers( Calendar cal ){

		AttendanceInsertDAO dao = new AttendanceInsertDAO();

		AttendanceCalendarDTO dto = getCalendarString( cal );

		ArrayList<StudentsSearchDTO> usersList = new ArrayList<StudentsSearchDTO>();

		usersList = dao.select( dto.getYearString(), dto.getMonthString() );

		setThisMonth();

		dto = getCalendarString( thisCal );

		String thisMonth = dto.getMonthString();

		while( thisMonth.equals( dto.getMonthString() ) ){

			for( int i=0; i<usersList.size(); i++ ){

				if( dao.check( dto.getYearString() + dto.getMonthString() + dto.getDayString(), usersList.get(i).getUserid() ) ) continue;

				dao.insert( dto.getYearString() + dto.getMonthString() + dto.getDayString() , usersList.get(i).getUserid() );
			}

			thisCal.add(Calendar.DATE, 1);
			dto = getCalendarString( thisCal );
		}
	}
	/**
	 * 実行メソッド 渡したカレンダーの月の受講生を追加
	 * @author MINORI SUNAGAWA
	 */
	//	private void insertUsers( Calendar cal ){
	//
	//	}

	/**
	 * 取得メソッド
	 * @author MINORI SUNAGAWA
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public String getYear() {
		return year;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setYear(String year) {
		this.year = year;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public String getMonth() {
		return month;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public Calendar getCal() {
		return cal;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public Calendar getThisCal() {
		return thisCal;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setThisCal(Calendar thisCal) {
		this.thisCal = thisCal;
	}


}
