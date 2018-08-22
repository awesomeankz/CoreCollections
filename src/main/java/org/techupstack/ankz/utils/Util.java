package org.techupstack.ankz.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Util {
	

	public static <E> void printCollection(Collection<E> coll) {
		System.out.println("Printing : " + coll.getClass().getName());
		for (E e : coll) {
			System.out.println(e);
		}
		System.out.println("------");

	}
	
	public static <K, V> void printMap(Map<K, V> map){
		System.out.println("Printing : " + map.getClass().getName());
		for ( Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		System.out.println("------");
	}
	
	public static void compare(Object o1, Object o2){
		System.out.println("comapring " + o1.getClass().getName() + " with " + o1.getClass().getName());
		System.out.println("o1.hashCode() : " + o1.hashCode());
		System.out.println("o2.hashCode() : " + o2.hashCode());
		System.out.println("(o1 ==o2) is : " + (o1 ==o2));
		System.out.println("o1.equals(o2) is : " + o1.equals(o2));
		System.out.println("-----------");
}


}
