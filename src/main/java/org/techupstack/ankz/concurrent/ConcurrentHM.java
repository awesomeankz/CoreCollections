package org.techupstack.ankz.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM {

	public static void main(String[] args) {
		
		callConcurrentHM();

	}

	private static void callConcurrentHM() {
		Map<String, String> chm = new ConcurrentHashMap<>(16);
		chm.put("key1", "Name1");
		chm.put("key2", "Name2");
		chm.put("key3", "Name3");
		chm.put("key3", "Name4");
		System.out.println(chm);
 		
	}

}
