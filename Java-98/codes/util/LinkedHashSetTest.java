package co.edureka.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Praveen"));
		System.out.println(names.add("Praveen"));
		System.out.println(names.add("Anil"));
		names.add("Charles");
		names.add("Bharath");
		names.add("Rahul");
		names.add("Sachin");
		
		System.out.println(names);
		
		names.add(null);
		System.out.println(names);		
	}
}