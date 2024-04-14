package pack1;

import pack2.BoxWeight;

public class BoxPrice extends BoxWeight {

		public int price , product;
		public BoxPrice(int length, int width, int height , int weight , int price){
			super(length,width,height,weight);
			this.price =price;
	}
		public void show()
		{
			super.show();
			System.out.println(price);
		}
		public int calculatePrice()
		{
			product = weight*price;
			return product;
		}
		}
		
