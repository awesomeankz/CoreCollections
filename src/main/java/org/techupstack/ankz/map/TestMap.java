package org.techupstack.ankz.map;

import java.util.HashMap;
import java.util.Map;

import org.techupstack.ankz.utils.Util;

public class TestMap {

	public static void main(String[] args) {

		Util.printMap(setHashMap());

	}

	private static Map<Integer, String> setHashMap() {
		final Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		
		return hm;
	}
}
