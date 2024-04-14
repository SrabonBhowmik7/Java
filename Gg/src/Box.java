
public class Box {
	public static Box b3;

		//class Inner{
		//Inner(){
			//System.out.println("This is inner class");
		//}
		//void showinner()
		{
			//System.out.println("This is inner class method");
			
		}
		//void Innerobject(){
			//Inner inner = new Inner();
			//inner.showinner();
		//}
		int length,width,height;
		//void sedim(){
			//length = 0;
			//width = 0;
			//height = 0;
		//}
		Box ()
		{
			
		}
		Box(int length, int width, int height)
		{
			this.length = length;
			this.width = width;
			this.height = height;
			
		}
		void printvalues()
		{System.out.println(length);
		System.err.println( width );
		System.out.println(height);
		}
		int area (){
			return length*height*width;
		}
		void printvalues(int a ){
			System.out.println(a);
		}
		
		static Box compareArea(Box b1, Box b2)
		{
			if (b1.area() > b2.area())
				return b1;
			else 
				return b2;
		}
		public void show (){
			System.out.println(area());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


