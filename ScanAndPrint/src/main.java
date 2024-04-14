import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		System.out.println("value of a = " +a);
	
		float b = sc.nextFloat();
		System.out.println("value of b = " +b);
		
		char c = sc.next().charAt(0);
		System.out.println( "value of c = "+c);
		
		
		double e = sc.nextDouble();
		System.out.println("Value of double = " +e + "\n\n");
		
		String d = sc.next();
		System.out.println("String is = " +d);
		
		//int array [] = new int [5];
		int  array []= {0,1,2,5,4};
		
		System.out.println(array[3]);
		
		
		
	}

}
