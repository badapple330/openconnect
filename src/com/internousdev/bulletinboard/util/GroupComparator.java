package com.internousdev.bulletinboard.util;

import java.util.Comparator;

import com.internousdev.bulletinboard.dto.GroupDTO;

public class GroupComparator implements Comparator<GroupDTO>{

	@Override
	public int compare(GroupDTO o1, GroupDTO o2) {
		int diff = o1.getLastMsgAt().compareTo(o2.getLastMsgAt());

		if(diff > 0){
			return -1;
		}else if(diff ==0){
			return 0;
		}else{
			return +1;
		}
	}

}
