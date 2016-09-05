/**
 *
 */
package com.internousdev.openconnect.attendance.dto;

/**
 * @author internous
 *
 */
public class AttendanceDTO {

	/**
	 * @param args
	 */
	private String date;
	private int id;
	private int attendance;
	private int interview;



	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date=date;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getAttendance(){
		return attendance;
	}
	public void setAttendance(int attendance){
		this.attendance=attendance;
	}
	public int getInterview(){
		return interview;
	}
	public void setInterview(int interview){
		this.interview=interview;
	}

}
