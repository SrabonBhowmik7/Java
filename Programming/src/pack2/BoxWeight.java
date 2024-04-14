package pack2;

public class BoxWeight extends Box {
protected int weight;
	
	public BoxWeight(int lenght, int widht,int height,int weight)
	{
		super(lenght,widht,height);
		this.weight =weight;
		
	}
	public void show (){
		System.out.println(length);
		System.out.println(height);
		System.out.println(width);
		System.out.println(weight);
	}
   
}


