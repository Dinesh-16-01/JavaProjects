package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SampleA {

	public static void main(String[] args) {
		HastSet <Integer> x = new HashSet<>();
		Integer[]y = {10,20,50,4,88,55,47,456};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		x.remove(2);
		System.out.println(x);
		
		List<String> a = new LinkedList<String>();
		a.add("Dinesh");
		a.add("Kumar");
		a.add("Bangalore");
		System.out.println(a);
		
		a.remove("Kumar");
		System.out.println(a);
	}

}
