/**
 *
 */
package com.internousdev.openconnect.decision.dto;

import java.sql.Date;

/**
 * @author internous
 *
 */
public class DecisionDTO {
	private Date Registration;
	private String user;
	private String project_list;
	private int project_id;
	private String project_name;
	private String detail;
	private String i_drafthing_id;
	private String i_approval_id;
	private String cd_id;
	private String i_a_d_id;
	private String i_a_id;
	public Date getRegistration() {
		return Registration;
	}
	public void setRegistration(Date registration) {
		Registration = registration;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getProject_list() {
		return project_list;
	}
	public void setProject_list(String project_list) {
		this.project_list = project_list;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getI_drafthing_id() {
		return i_drafthing_id;
	}
	public void setI_drafthing_id(String i_drafthing_id) {
		this.i_drafthing_id = i_drafthing_id;
	}
	public String getI_approval_id() {
		return i_approval_id;
	}
	public void setI_approval_id(String i_approval_id) {
		this.i_approval_id = i_approval_id;
	}
	public String getI_a_d_id() {
		return i_a_d_id;
	}
	public void setI_a_d_id(String i_a_d_id) {
		this.i_a_d_id = i_a_d_id;
	}
	public String getI_a_id() {
		return i_a_id;
	}
	public void setI_a_id(String i_a_id) {
		this.i_a_id = i_a_id;
	}
	public String getCd_id() {
		return cd_id;
	}
	public void setCd_id(String cd_id) {
		this.cd_id = cd_id;
	}


	}







