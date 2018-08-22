package org.techupstack.ankz.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM {

	public static void main(String[] args) {
		
		callConcurrentHM();

	}

	private static void callConcurrentHM() {
		Map<String, String> chm = new ConcurrentHashMap<>(16);
 		
	}

}
