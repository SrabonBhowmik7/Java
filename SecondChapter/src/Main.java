import java.nio.channels.ByteChannel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicyle bike1 = new Bicyle();
		Bicyle bike2 = new Bicyle();
		//above two lines are for creating two objects in thisprogram.
		//call methods on those objects 
		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		
		//here in object bike2 same method call two times there for last updated valu has been taken  
		bike2.printStates();
		
	}

}
