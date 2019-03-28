package assignment_5;

import java.util.*;

public class Debug {

	public void showRecords(Set<Object> set) {
		if(!set.isEmpty()) {
			Iterator<Object> iterator = set.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		else {
			System.out.println("Set is an empty set");
		}
	}
	
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add("Lourie");
		set.add("Amy");
		set.add("Richard");
		set.add("Mark");
		Debug debug = new Debug();
		System.out.println("Printing the records......");
		debug.showRecords(set);
	
	}
	
}