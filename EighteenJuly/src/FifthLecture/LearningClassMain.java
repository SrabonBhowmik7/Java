package FifthLecture;

import org.omg.CORBA.PUBLIC_MEMBER;

public class LearningClassMain {
	private int aNumber = 12; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car ourCar = new Car();
		
		 Car thirdcar = new Car("mazda", "axela", "top", 1500, 20);
		
		 //ourCar.presentAmountOfFuel();
		//String name = ourCar.mName; 
		
		 Car AnotherCar = new Car("Toyota", "Aillion", "qwerty", 1500, 30);
		
		 SubCar ourSubCar = new SubCar("bmw", "7 series", "uio", 3000, 25, 10, "grey");
		 System.out.println("\n\n");
		 
		System.out.println("Manufecturer : " +AnotherCar.mName);
		System.out.println("engineCC : " + AnotherCar.engineCC);
		System.out.println("Modelname: "+ AnotherCar.getmodelName());
		System.out.println("PasswordMatch : " + AnotherCar.matchpassword("fsdfs"));
		//System.out.println(AnotherCar.key);
		System.out.println("First Car CC: "+ ourCar.engineCC);
		System.out.println( "Second car CC : " + AnotherCar.engineCC);
		System.out.println("Amount of Fuel :"+AnotherCar.presentAmountOfFuel()+"Ltr");
		AnotherCar.addFuel(2);
		System.out.println("Amount of Fuel after adding 2 Ltr :"+AnotherCar.presentAmountOfFuel()+"Ltr");
		AnotherCar.runForSec(60);
		System.out.println("Amount of Fuel after driving for 60sec :"+AnotherCar.presentAmountOfFuel()+"Ltr");
		
		System.out.println("\n\n");
		
		System.out.println("Manufecturer : " +thirdcar.mName);
		System.out.println("engineCC : " + thirdcar.engineCC);
		System.out.println("Modelname: "+ thirdcar.getmodelName());
		System.out.println("PasswordMatch : " + thirdcar.matchpassword("fsdfs"));
		//System.out.println(AnotherCar.key);
		//System.out.println("First Car CC: "+ ourCar.engineCC);
		
		System.out.println( "Second car CC : " + thirdcar.engineCC);
		System.out.println("Amount of Fuel :"+thirdcar.presentAmountOfFuel()+"Ltr");
		thirdcar.addFuel(2);
		System.out.println("Amount of Fuel after adding 2 Ltr :"+thirdcar.presentAmountOfFuel()+"Ltr");
		thirdcar.runForSec(60);
		System.out.println("Amount of Fuel after driving for 60sec :"+thirdcar.presentAmountOfFuel()+"Ltr");
		
		System.out.println("\n\n");
		//ourSubCar
		System.out.println("Manufecturer : " +ourSubCar.mName);
		System.out.println("engineCC : " + ourSubCar.engineCC);
		System.out.println("Modelname: "+ ourSubCar.getmodelName());
		System.out.println("PasswordMatch : " + ourSubCar.matchpassword("fsdfs"));
		//System.out.println(AnotherCar.key);
		//System.out.println("First Car CC: "+ ourCar.engineCC);
		
		System.out.println( "Second car CC : " + ourSubCar.engineCC);
		System.out.println("Amount of Fuel :"+ourSubCar.presentAmountOfFuel()+"Ltr");
		ourSubCar.addFuel(2);
		System.out.println("Amount of Fuel after adding 2 Ltr :"+ourSubCar.presentAmountOfFuel()+"Ltr");
		ourSubCar.runForSec(60);
		System.out.println("Amount of Fuel after driving for 60sec :"+ourSubCar.presentAmountOfFuel()+"Ltr");
		System.out.println("Charge in Battery : " + ourSubCar.getChargeInBattery());
		System.out.println("Color of car : " + ourSubCar.getColor());
		
		
	}
	

} 
