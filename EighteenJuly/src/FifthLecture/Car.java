package FifthLecture;

import java.lang.reflect.Method;

public class Car {
	public int engineCC;
	private String modelname;
	public String mName;
	//public  float carWeight;
	private float fuelamount;
	private String carKeyValue;
	final private float amountOfFuelConsume = (float) 0.02; 
	public Car(){
		mName = new String();
		modelname = new String();
		engineCC = 1000;
		//carWeight = 0;
		fuelamount = 0;
	}
	public Car (String carName){
		mName = new String(carName);
		modelname = new String();
		engineCC = 0;
		//carWeight = 0;
		fuelamount = 0;
	}
	 public Car(String manu, String model, String key ,int engineCC, float fuel ){
		 mName = manu;
		 modelname = model;
		 carKeyValue = key;
		 this.engineCC= engineCC;
		 fuelamount = fuel;
		 
	 }
	 
	public float presentAmountOfFuel(){
		
		return fuelamount;
		
	}
	public String getmanufacturename(){
		return mName;
		
	}
	public void addFuel(float fuelAmount){
		this.fuelamount+= fuelAmount;
	}
	public void runForSec(int timeSec)
	{
		float usedFuel = timeSec*amountOfFuelConsume;
		//updatedfuelamount
		fuelamount-= usedFuel;
		
		
		
	}
	public String getmodelName(){
		return modelname;
	}
	public boolean matchpassword(String userinput)
	{
		return userinput.equals(carKeyValue);
	}
	
 } 
