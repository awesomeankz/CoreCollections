package org.techupstack.ankz.utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestHashCode {

	public static void main(String[] args) {
		
//		testForIntegers();
		testForStrings();
		
		
//		compareStrings();
		TestHashCode obj = new TestHashCode();
		
		
		ClassLoader classLoader = obj.getClass().getClassLoader();
		File file = new File(classLoader.getResource("TestFile.properties").getFile());
		
		PrintStream result = null;
		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
			
		System.out.println( result.toString() );
		

	}

	private static void compareStrings() {
		//String literal
		System.out.println("String literal");
		String s2 = "abc";
		System.out.println("hashcode is " + s2.hashCode());
		System.out.println("is equals : "  + s2.equals("abc"));  //T
		System.out.println("is == : " + String.valueOf( s2 == "abc") );  //T
		System.out.println("-----");
		
		//String Object
		System.out.println("String Object");
		String s = new String("abc");
		System.out.println("hashcode is " + s.hashCode());
		System.out.println("is equals : "  + s.equals("abc"));  //T
		System.out.println("is == : " + String.valueOf( s == "abc") );  //F
		System.out.println("-----");
		
		System.out.println("is == : " + String.valueOf( s == s2) );  //F
		System.out.println("is equals : "  + s.equals(s2));  //T
		
	}

	private static void testForIntegers() {
		Integer i = new Integer(100);
		System.out.println("hashcode is " + i.hashCode());
		System.out.println("is equals : "  + i.equals(100));
		System.out.println("-----");
	}

	private static void testForStrings() {

		//String literal
		System.out.println("String literal");
		String s2 = "abc";
		System.out.println("hashcode is " + s2.hashCode());
		System.out.println("is equals : "  + s2.equals("abc"));  //T
		System.out.println("is == : " + String.valueOf( s2 == "abc") );  //T
		System.out.println("-----");
		
		//String Object
		System.out.println("String Object");
		String s = new String("abc");
		System.out.println("hashcode is " + s.hashCode());
		System.out.println("is equals : "  + s.equals("abc"));  //T
		System.out.println("is == : " + String.valueOf( s == "abc") );  //F
		System.out.println("-----");
	
		
		//interned String object
		System.out.println("interned String object");
		String s3 = s.intern();
		System.out.println("hashcode is " + s3.hashCode());
		System.out.println("is equals : "  + s3.equals("abc")); //T
		System.out.println("is == : " + String.valueOf( s3 == "abc") ); //T
		System.out.println("-----");
		
		//non interend String object
		System.out.println("non interend String object");
		String s4 = s;
		System.out.println("hashcode is " + s4.hashCode());
		System.out.println("is equals : "  + s4.equals("abc")); //T
		System.out.println("is == : " + String.valueOf( s4 == "abc") ); //F
		System.out.println("-----");
	}

}
