package com.internousdev.bulletinboard.util;

import java.util.Comparator;

import com.internousdev.bulletinboard.dto.TimelineDTO;

public class TimelineComparator implements Comparator<TimelineDTO>{

	@Override
	public int compare(TimelineDTO o1, TimelineDTO o2) {
		int diff = o1.getSendAt().compareTo(o2.getSendAt());

		if(diff > 0){
			return -1;
		}else if(diff ==0){
			return 0;
		}else{
			return +1;
		}
	}

}
