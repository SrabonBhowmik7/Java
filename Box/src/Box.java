
public class Box {
	int length, width, height;
	void setDim() {
		length = 0;
		width = 0;
		height = 0;
	}
	Box (int x, int y, int z){
		length = x;
		width = y;
		height = z;
	}
	void printvalues(){
		System.out.println("lenght "+length+" width "+width+" height "+height);
	}
	int area (int l, int m, int n)
	{
		return l*m*n;
	}
	void printvalues(int area)
	{
		System.out.println("Area "+area);
	}
}
