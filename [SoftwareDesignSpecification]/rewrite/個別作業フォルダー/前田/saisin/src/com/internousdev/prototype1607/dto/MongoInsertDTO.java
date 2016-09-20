/**
 *
 */
package com.internousdev.prototype1607.dto;

/**
 * @author internous
 *
 */
public class MongoInsertDTO {

	private String name;
	private String comment;

	//name
	public String getName(){
		return name;
	}

	//name セットするname

	public void setName(String name){
		this.name=name;
	}
	public String getComment(){
		return comment;
	}
	public void setComment(String cooment){
		this.comment=comment;
	}

}
