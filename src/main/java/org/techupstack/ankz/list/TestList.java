package org.techupstack.ankz.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.techupstack.ankz.utils.Util;


public class TestList {

	public static void main(String[] args) {

		Util.printCollection(setIntArrayList());
		Util.printCollection(setIntLinkedList());
		
		Util.printCollection(setFinalArrayList());
		Util.printCollection(setUnmodifiableList());
		

	}

	private static List<String> setUnmodifiableList() {
		List<String> umList =new ArrayList<>(3);
		umList.add("A1");
		umList.add("A2");
		umList.add("A3");
		System.out.println("size : " + umList.size());
		umList =  Collections.unmodifiableList(umList);
//		below operation should throw java.lang.UnsupportedOperationException
//		umList.add("A4");
		return umList;
		}

	private static List<String> setFinalArrayList() {
		final List<String> arrList = new ArrayList<>(3);
		//only constraint is that we cann't init it again though addition/removal won't be affected.
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		arrList.add("E");
		Util.printCollection(arrList);
		arrList.remove("E");
		return arrList;
		
		
	}

	private static List<Integer> setIntArrayList() {
		List<Integer> arrLst = new ArrayList<>();
		arrLst.add(1);
		arrLst.add(2);
		arrLst.add(3);
		return arrLst;
	}

	private static List<Integer> setIntLinkedList() {
		List<Integer> linkedLst = new LinkedList<>();
		linkedLst.add(5);
		linkedLst.add(6);
		linkedLst.add(7);
		return linkedLst;
	}


}
