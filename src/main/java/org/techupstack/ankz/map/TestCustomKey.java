package org.techupstack.ankz.map;

import java.util.HashMap;
import java.util.Map;

import org.techupstack.ankz.utils.Util;

public class TestCustomKey {

	public static void main(String[] args) {
//		Util.printMap(getStudentWoHashEqualMap());
//		Util.printMap(getStudentWoHashMap());
		Util.printMap(getStudentWoEqualsMap());

	}
	
	private static Map<StudentWoEquals, String> getStudentWoEqualsMap() {
		System.out.println("IN getStudentWoEqualsMap ---");
		
		
		StudentWoEquals stu1 = new StudentWoEquals(1, "stu1");
//		StudentWoEquals stu2 = new StudentWoEquals(2, "stu2");
		StudentWoEquals stu3 = new StudentWoEquals(1, "stu1");
		
//		Util.compare(stu1, stu2);
		Util.compare(stu1, stu3);
		
		
		Map<StudentWoEquals, String> studentMap = new HashMap<>();
		studentMap.put(stu1, "stu1");
//		studentMap.put(stu2, "second");
		studentMap.put(stu3, "stu3");
		System.out.println("getKey stu1 : " + studentMap.get(stu1) );
		System.out.println("getKey stu3: " + studentMap.get(stu3) );
		return  studentMap;
		
		
	
	}

	private static Map<StudentWoHash, String> getStudentWoHashMap() {
		System.out.println("IN getStudentWoHashMap ---");
		
		
		StudentWoHash stu1 = new StudentWoHash(1, "stu1");
//		StudentWoHash stu2 = new StudentWoHash(2, "stu2");
		StudentWoHash stu3 = new StudentWoHash(1, "stu1");
		
//		Util.compare(stu1, stu2);
		Util.compare(stu1, stu3);
		
		
		Map<StudentWoHash, String> studentMap = new HashMap<>();
		studentMap.put(stu1, "first");
//		studentMap.put(stu2, "second");
		studentMap.put(stu3, "first");
		System.out.println("getKey stu1 : " + studentMap.get(stu1) );
		System.out.println("getKey stu3: " + studentMap.get(stu3) );
		return  studentMap;
		
		
	
	}

	private static  Map<StudentWoHashEqual,String> getStudentWoHashEqualMap(){
		System.out.println("IN getStudentWoHashEqualMap ---");
		
		StudentWoHashEqual stu1 = new StudentWoHashEqual(1, "stu1");
		StudentWoHashEqual stu2 = new StudentWoHashEqual(2, "stu2");
		StudentWoHashEqual stu3 = new StudentWoHashEqual(1, "stu1");
		
		Util.compare(stu1, stu2);
		Util.compare(stu1, stu3);
		
		
		Map<StudentWoHashEqual, String> studentMap = new HashMap<>();
		studentMap.put(stu1, "first");
		studentMap.put(stu2, "second");
		studentMap.put(stu3, "first");
		
		return  studentMap;
		
		
	}
	
	
	
}
