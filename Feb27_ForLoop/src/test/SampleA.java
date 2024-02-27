package test;
import java.util.Scanner;
public class SampleA {

	public static void main(String[] args) {
	System.out.println("Start Execution....");
	Scanner s1 = new Scanner(System.in);
	int table = s1.nextInt();
	for(int i = 1; i<=10; i=i+1) {
		System.out.println(i+"x"+table+"="+i*table);
	}
	s1.close();

	}
}
