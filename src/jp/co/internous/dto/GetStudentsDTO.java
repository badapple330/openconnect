package jp.co.internous.dto;

public class GetStudentsDTO {


	private String number;
	private String name;
	private String symbol;
	private String entrance;
	/**
	 * @return number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param numberのセット
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return 氏名
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param nameのセット
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return しめい
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbolのセット
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return 入講年月
	 */
	public String getEntrance() {
		return entrance;
	}
	/**
	 * @param entranceのセット
	 */
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

}