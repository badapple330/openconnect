package com.internousdev.bulletinboard.util;

import java.util.Comparator;

import com.internousdev.bulletinboard.dto.PostDTO;

public class GroupComparator implements Comparator<PostDTO>{

	@Override
	public int compare(PostDTO o1, PostDTO o2) {
		int diff = o1.getPostAt().compareTo(o2.getPostAt());

		if(diff > 0){
			return -1;
		}else if(diff ==0){
			return 0;
		}else{
			return +1;
		}
	}

}
