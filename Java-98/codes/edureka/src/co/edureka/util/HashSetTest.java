package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Praveen"));
		System.out.println(names.add("Praveen"));
		System.out.println(names.add("Anil"));
		names.add("Charles");
		names.add("Bharath");
		names.add("Rahul");
		names.add("Sachin");
		
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("\t-----> " + name);
			Thread.sleep(1000);
		}
		System.out.println();
		
		names.add(null);
		System.out.println(names);
	}
}
