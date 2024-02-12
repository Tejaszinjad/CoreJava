package interface3;

public class SmartDevice implements Phone,Tablet,Laptop{
	
	public void turnOn() {
		System.out.println("Turn On Device");
	}
	
	public void turnOff() {
		System.out.println("Turn Off Device");
	}
	
	public void chargeBattery() {
		System.out.println("Charge battery");
	}

}
