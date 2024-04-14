package Pack2;

public class Box {
double length,width,height;

public Box(){
	
   }
public Box(double length,double width,double height)
{ 
	this.length=length;
	this.width=width;
	this.height=height;
	
	
}

public void show (){
	System.out.println(length);
	System.out.println(height);
	System.out.println(width);
   }
  public static Box CompareBox(Box b1,Box b2){
	  if (b1.length>b2.length && b1.width>b2.width && b1.height > b2.height)
		  return b1;
	  else if (b1.length <b2.length && b1.width <b2.width && b1.height <b2.height)
		  return b2;
	  else
		  return new Box ();
  
}
}
