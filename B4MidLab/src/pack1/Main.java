package pack1;
import pack2.Box;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box (4,5,8);
		//b1.show();
		Box b2 = new Box (8,9,9);
		//b2.show();
		Box b3 = new Box();
		b3=Box.compareBox(b1, b2);
		b3.show();
		//System.out.println();
		BoxPrice b4 = new BoxPrice(5,8,6,4,5);
		System.out.println(b4.calculatePrice());
		
	}

}
