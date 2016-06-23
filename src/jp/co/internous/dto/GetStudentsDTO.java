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
	 * @param number セットする number
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol セットする symbol
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return entrance
	 */
	public String getEntrance() {
		return entrance;
	}
	/**
	 * @param entrance セットする entrance
	 */
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

}