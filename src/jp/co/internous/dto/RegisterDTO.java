package jp.co.internous.dto;

public class RegisterDTO {


	private int user_id;
	private String password;
	private String name;
	private String name_f;
	private String postal;
	private String address;
	private String tel_number;
	private String email;
	private String sex;
	private String birthday;
	private String register_day;
	private String update_day;
	private boolean userdel_flg;
	private boolean login_flg;
	private boolean user_flg;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_f() {
		return name_f;
	}
	public void setName_f(String name_f) {
		this.name_f = name_f;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel_number() {
		return tel_number;
	}
	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRegister_day() {
		return register_day;
	}
	public void setRegister_day(String register_day) {
		this.register_day = register_day;
	}
	public String getUpdate_day() {
		return update_day;
	}
	public void setUpdate_day(String update_day) {
		this.update_day = update_day;
	}
	public boolean isUserdel_flg() {
		return userdel_flg;
	}
	public void setUserdel_flg(boolean userdel_flg) {
		this.userdel_flg = userdel_flg;
	}
	public boolean isLogin_flg() {
		return login_flg;
	}
	public void setLogin_flg(boolean login_flg) {
		this.login_flg = login_flg;
	}
	public boolean isUser_flg() {
		return user_flg;
	}
	public void setUser_flg(boolean user_flg) {
		this.user_flg = user_flg;
	}

}
