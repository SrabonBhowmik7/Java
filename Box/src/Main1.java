
public class Main1 {
	public static void main(String[] args) {
		Box b1 = new Box();
		
		Box b2 = new Box(1, 2, 3);
		b2.area();
		int result = Box.compare(7, 14);
		System.out.println(result);
		//b1.area(5);
		
	}
	
	//static void prln(Object a)
	{
		//System.out.println(a);
	}
	
}
