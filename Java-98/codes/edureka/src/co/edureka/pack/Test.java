package co.edureka.pack;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>() {{
			 add("set1");
			 add("set2");
			 add("set1");
			}
		};
		
		System.out.println(set);
	}

}
