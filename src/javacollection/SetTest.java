package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
	/*	Set<String> set=new HashSet<>();
		set.add("hals");
		set.add("java");
		set.add("html");
		set.add("php");
		set.add("css");
		
		for(String s: set) {
			System.out.println(s);
		}*/
		Set<String> set=new LinkedHashSet<>();
		set.add("hals");
		set.add("java");
		set.add("html");
		set.add("php");
		set.add("css");
		
		for(String s: set) {
			System.out.println(s);
		}
	}
}
