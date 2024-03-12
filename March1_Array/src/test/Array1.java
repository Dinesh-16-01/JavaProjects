package test;

public class Array1 {

	public static void main(String[] args) {
		int x[]=new int [100];
		x[0]=100;
		x[99]=450;
		System.out.println(x[0]);
		System.out.println(x[99]);
		
		System.out.println(x[100]);
		
		x[0]=150;
		System.out.println(x[0]);
		System.out.println(x[99]);

	}

}
