package testA;
import java.util.Scanner;
public class SampleA {

	public static void main(String[] args) {
		System.out.println("Starting Execution");
		int a = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value....");
		int table = scan.nextInt();
		do {
			System.out.print(a);
			System.out.print("x");
			System.out.print(table);
			System.out.print("=");
			System.out.println(a*table);
			a = a+1;
		}while(a<=20);
		System.out.println("Ending Execution");
	}

}
