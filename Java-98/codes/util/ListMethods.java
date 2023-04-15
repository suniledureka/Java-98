package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("is empty = " + names.isEmpty());
		System.out.println(names + " | size="+names.size());
		
		names.add("Sunil");		
		names.add("Anup");
		names.add("Sachin");
		names.add("Sunil");
		names.add("Atharv");
		names.add("Dheeraj");
		names.add("Sunil");
		System.out.println(names + " | size="+names.size());
		
		System.out.println("no of times \"Sunil\" in list = " + names.stream().filter(name -> name.equals("Sunil")).count());
		
		names.add(1, "Faith");
		names.set(2, "ANUP");
		System.out.println(names + " | size="+names.size());
		
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
		System.out.println("is \"Anil\" in list = " + names.contains("Anil"));
		
		System.out.println("index of \"Sunil\" = " + names.indexOf("Sunil"));
		System.out.println("index of \"Sunil\" from last = " + names.lastIndexOf("Sunil"));
		System.out.println("index of \"Anil\" = " + names.indexOf("Anil"));
		
		System.out.println("person @ index 0 = " + names.get(0));
		
		System.out.println(names.remove(0)); //Sunil
		System.out.println(names.remove("Sunil")); //true
		
		System.out.println(names + " | size="+names.size());
	}
}