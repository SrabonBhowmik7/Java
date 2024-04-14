package pack1;
import Pack2.Box;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(10,12,14);
		//b1.show();
		Box b2 =new Box(14,10,11);
		Box b3 =new Box();
		b3=Box.CompareBox(b1, b2);
		//b3.show();
		BoxPrice b = new BoxPrice(5,4,6,7,8);
		System.out.println(b.calculateprice());
		

	}

}
