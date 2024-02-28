package test;

public class Pattern2 {

	public static void main(String[] args) {
		int count = 1;
		for(int a = 1; a<=10; a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print(count + " ");
				count = count + 1;
			}
		System.out.println();
	}
	}
}
