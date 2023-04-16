package co.edureka.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Praveen"));
		System.out.println(names.add("Praveen"));
		System.out.println(names.add("Anil"));
		names.add("Charles");
		names.add("Bharath");
		names.add("Rahul");
		names.add("Sachin");
		
		System.out.println(names);
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}
}
