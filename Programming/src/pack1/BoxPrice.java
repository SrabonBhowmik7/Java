package pack1;
import pack2.BoxWeight;

public class BoxPrice extends BoxWeight {
int price;
	
	public BoxPrice(int length,int width,int height,int weight,int price){
		super(length, width,height,weight);
		this.price = price;
		
	}
	public void show(){
		super.show();
		System.out.println(price);
	}
		
		public int calculateprice(){
			return weight*price;
	}

}



