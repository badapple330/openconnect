
package com.internousdev.openconnect.attendance.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.internousdev.openconnect.attendance.dao.AddAttendanceDAO;
import com.internousdev.openconnect.util.DailyIterator;
import com.internousdev.openconnect.util.Scheduler;
import com.internousdev.openconnect.util.SchedulerTask;

/** 毎日0時に全Userの勤怠を『連絡なし』で送るためのメソッド
 * @author Teppei Matsumoto
 * @since  2017/06/27
 * @version 1.0
 */
public class AddAttendanceAction extends HttpServlet {
	private final Scheduler scheduler = new Scheduler();


	private final int hourOfDay, minute, second;


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5350844672857079386L;


	/**
	 * ユーザーID
	 * joinでuser_nameを引っ張って来たい
	 */
	private int userId;

	/**
	 * 出欠状況
	 */
	private String attendance="連絡なし";

	/**
	 * 備考欄
	 */
	private String reason;

	Calendar cal = Calendar.getInstance();


	/**
	 * 報告年
	 */
	private int atYear=cal.get(Calendar.YEAR);

	/**
	 * 報告月
	 */
	private int atMonth= cal.get(Calendar.MONTH)+1;

	/**
	 * 報告日
	 */
	private int atDay= cal.get(Calendar.DAY_OF_MONTH);

	Calendar cal2 = Calendar.getInstance();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



	/** 指定した時間に値をインサートするメソッド
	 *
	 * @param hourOfDay
	 * @param minute
	 * @param second
	 */
	public AddAttendanceAction(int hourOfDay, int minute, int second) {
		this.hourOfDay = hourOfDay;
		this.minute = minute;
		this.second = second;
	}



	public void init(ServletConfig config) throws ServletException {
		//HttpServletに合わせてタスクを開始
		start();
		}

	public void start() {

		scheduler.schedule(new SchedulerTask() {
			public void run() {
				atendanceadd();
			}

			public void atendanceadd(){

				cal.setLenient(true);
				cal2.setLenient(true);
				cal2.add(Calendar.DAY_OF_MONTH,1);

				String atDate =sdf.format(cal.getTime());
				String atDate2 =sdf.format(cal2.getTime());


				AddAttendanceDAO dao=new AddAttendanceDAO();


				if(dao.insert(userId)>0){
					int count = dao.update(atYear,atMonth,atDay,attendance,atDate,atDate2);
					if(count > 0){

				}}

			}
		}, new DailyIterator(hourOfDay, minute, second));
		}

	public static void main(String[] args) {
		AddAttendanceAction addTime = new AddAttendanceAction(17, 00, 0);
		addTime.start();
		}

	/**
	* 取得メソッド を取得
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}

	/**
	* 設定メソッド を設定
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド を取得
	* @return attendance
	*/
	public String getAttendance() {
		return attendance;
	}

	/**
	* 設定メソッド を設定
	* @param attendance
	*/
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	/**
	* 取得メソッド を取得
	* @return reason
	*/
	public String getReason() {
		return reason;
	}

	/**
	* 設定メソッド を設定
	* @param reason
	*/
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	* 取得メソッド を取得
	* @return atYear
	*/
	public int getAtYear() {
		return atYear;
	}

	/**
	* 設定メソッド を設定
	* @param atYear
	*/
	public void setAtYear(int atYear) {
		this.atYear = atYear;
	}

	/**
	* 取得メソッド を取得
	* @return atMonth
	*/
	public int getAtMonth() {
		return atMonth;
	}

	/**
	* 設定メソッド を設定
	* @param atMonth
	*/
	public void setAtMonth(int atMonth) {
		this.atMonth = atMonth;
	}

	/**
	* 取得メソッド を取得
	* @return atDay
	*/
	public int getAtDay() {
		return atDay;
	}

	/**
	* 設定メソッド を設定
	* @param atDay
	*/
	public void setAtDay(int atDay) {
		this.atDay = atDay;
	}

	/**
	* 取得メソッド を取得
	* @return scheduler
	*/
	public Scheduler getScheduler() {
		return scheduler;
	}
}

