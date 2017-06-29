/**
 *
 */
package com.internousdev.bulletinboard.util;

import java.util.Random;

/**
 * @author internousdev
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<20;i++){
			Random rnd = new Random();
			int ran = rnd.nextInt(3)+1;
			System.out.println(ran);
		}

	}


}
