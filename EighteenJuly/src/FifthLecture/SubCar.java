package FifthLecture;

import java.awt.Color;

public class SubCar extends Car {

	private float chargeInBattery;
	private String Color; 
	public SubCar(){
		super(); 
		
	}
	public SubCar(String manu,String model, String key, int engineCC,float fuel,float charge,String color) {
		super(manu, model, key, engineCC, fuel);
		chargeInBattery = charge;
		this.Color = color;
		
	}
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
}
