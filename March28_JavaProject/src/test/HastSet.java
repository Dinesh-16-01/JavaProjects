package test;

import java.util.Arrays;
import java.util.HashSet;

public class HastSet {

	public static void main(String[] args) {
		HastSet<Integer> x = new HashSet<>();
		x.addAll(Arrays.asList(1,2,3,4,6,7));
		System.out.println(x);

	}

}
