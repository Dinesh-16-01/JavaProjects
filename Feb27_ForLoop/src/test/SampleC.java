package test;

public class SampleC {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int i = 0; 
		do{
			c = a+b;
			System.out.println(" " + c);
			a=b;
			b=c;
			i++;
		}while(i<=25);
	}

}
