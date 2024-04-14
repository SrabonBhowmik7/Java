
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(4,8,9);
		Box b2 = new Box(4, 5, 2);
		Box b3 = new Box();
		int x = b1.area();
		int y = b2.area();
		b1.printvalues(x);
		b2.printvalues(y);
		b3 = Box.compareArea(b1, b2);
		b3.show();
		
		
		
	}

}
