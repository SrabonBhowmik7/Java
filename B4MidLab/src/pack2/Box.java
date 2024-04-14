package pack2;

public class Box {
	public int length, width, height;
	public Box() {
		// TODO Auto-generated constructor stub
		
	}
	public Box(int length, int width, int height )
	{
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	
	public void show (){
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
	}
	 public  static Box compareBox(Box b1,Box b2)
	{
		if(b1.height > b2.height && b1.length > b2.length && b1.width > b2.width)
			return b1;
		else if (b1.height <b2.height && b1.length <b2.length && b1.width < b2.width)
			return b2;
		else 
			return new Box();
	}
}
