package org.techupstack.ankz.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author ankz-su http://www.javacreed.com/modifying-an-unmodifiable-list/
 * 
 * 
 */

public class UnmodifiableList {

	public static void main(String[] args) {

		unmodifiableListView();
		unmodifiableListPreventingModifications();
	}

	/**
	 * The documentation mentions that the returned object (the unmodifiable
	 * list, referred to as returned list in this paragraph) is a read-only view
	 * of the given one (referred to in this paragraph as the given list).
	 * 
	 * Well now we know that while we cannot modify the returned list, any
	 * changes to the given list are observed by the returned one.
	 *
	 */
	private static void unmodifiableListView() {
		final List<String> modifiable = new ArrayList<>();
		modifiable.add("Java");
		modifiable.add("is");

		final List<String> unmodifiable = Collections.unmodifiableList(modifiable); //notice here, same list 
		System.out.println("Before modification: " + unmodifiable);

		modifiable.add("the");
		modifiable.add("best");

		System.out.println("After modification: " + unmodifiable);
	}

	/**
	 * Note that in this example, we are not passing the modifiable list object,
	 * but a new list created from this one. When we create a list like this,
	 * the elements of the given list are simply copied to the one being
	 * created. Therefore, these two lists (the modifiable list and the one just
	 * created: new ArrayList<>(modifiable) list) are disconnected and they only
	 * share the elements. Any modifications to each list will not affect the
	 * other.
	 */
	private static void unmodifiableListPreventingModifications() {
		final List<String> modifiable = new ArrayList<>();
		modifiable.add("Java");
		modifiable.add("is");

		final List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<>(modifiable));// here is the diff.
		System.out.println("Before modification: " + unmodifiable);

		modifiable.add("the");
		modifiable.add("best");

		System.out.println("After modification: " + unmodifiable);
	}

}
