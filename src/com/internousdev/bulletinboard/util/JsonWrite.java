package com.internousdev.bulletinboard.util;

import java.util.Arrays;
import java.util.List;

import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

public class JsonWrite {

	public static void main(String[] args) {

		Tokenizer tokenizer = Tokenizer.builder().build();

		List<Token> tokens = tokenizer.tokenize("グルーミング、");

		for (Token token : tokens) {
			System.out.println("==================================================");
			System.out.println("allFeatures : " + token.getAllFeatures());
			System.out.println("partOfSpeech : " + token.getPartOfSpeech());
			System.out.println("position : " + token.getPosition());
			System.out.println("reading : " + token.getReading());
			System.out.println("surfaceFrom : " + token.getSurfaceForm());
			System.out.println("allFeaturesArray : " + Arrays.asList(token.getAllFeaturesArray()));
			System.out.println("辞書にある言葉? : " + token.isKnown());
			System.out.println("未知語? : " + token.isUnknown());
			System.out.println("ユーザ定義? : " + token.isUser());
		}
		String n="*";
		if(n != "*"){

		}else{
			System.out.println("*");
		}


	}

}