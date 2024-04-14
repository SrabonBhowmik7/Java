import javax.print.attribute.ResolutionSyntax;

public class Calculator {
	int performAddition(int a, int b )
	{
		int result = a+b;
		System.out.println(result);
		return result ;
	}
	int performAddition (int a,int b,int c,int d)
	{
		int result = a + b+ c+ d;
		System.out.println(result);
		return result ;
	}
	float performAddition(float a, float b)
	{
		float result = a+b;
		return result ;
	}
	 double performAddition(double d, double e) {
		// TODO Auto-generated method stub
		double result = d + e ;
		System.out.println(result);
		return result ; 
	}
}
