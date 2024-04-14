package pack2;

public class BoxWeight extends Box {
		public int weight;
		
		public BoxWeight(int length, int width, int height, int weight ) {
			
			// TODO Auto-generated constructor stub
			
			super(length, width, height);
			this.weight = weight;
			
		}
		public void show ()
		{
			super.show();
			System.out.println(weight);
		}
}
