/**
 *
 */
package com.internousdev.openconnect.updateAttendance.dto;

/**
 * @author internous
 *
 */
public class UpdateAttendanceDTO {

	/**
	 * @param args
	 */
	private int date;
	private int id;
	private int attendance;
	private int interview;



	public int getDate(){
		return date;
	}
	public void setDate(int date){
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
