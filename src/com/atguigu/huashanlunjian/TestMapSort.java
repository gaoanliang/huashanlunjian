package com.atguigu.huashanlunjian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapSort {

	public static List<Entry<String, Integer>> sortMapByVal(
			HashMap<String, Integer> hashMap) {
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
		Collections.sort(list,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		return list;
	}
	
	

}
