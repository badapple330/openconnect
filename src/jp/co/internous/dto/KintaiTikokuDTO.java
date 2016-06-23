/**
 *
 */
package jp.co.internous.dto;

/**
 * @author internous
 *
 */
public class KintaiTikokuDTO {

	/**
	 * @author Sanshiro Kocho
	 * @since 16/6/23
	 */
	private int number;
	private String name;
	private String reason;

	public int geNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getReason() {
		return reason;
	}
	public void setComment(String reason) {
		this.reason = reason;
	}


}
