package org.techupstack.ankz.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dummy {

	public static void main(String[] args) {

		
		List<Integer> arrList1 = new ArrayList<>();
		for(int i=1; i<=5; i++)
			arrList1.add(i);
		
		System.out.println("arrList1 : " + arrList1);
		arrList1.add(5);
		arrList1.add(4);
		System.out.println("arrList1 : " + arrList1);
		
		Set<Integer> hset1 = new HashSet<>(arrList1);
		System.out.println("hset1 : " + hset1);
		
//		java.lang.UnsupportedOperationException
		Map<Integer, Integer> hMap1 = Collections.unmodifiableMap(new HashMap<>());
//		hMap1.put(5, 5);
		
		Map<Integer, Integer> hMap2 = Collections.synchronizedMap(new HashMap<>());
		hMap2.put(5, 5);
		System.out.println("hMap2 : " + hMap2);
	}

}
