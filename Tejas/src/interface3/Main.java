package interface3;

public class Main {
	public static void main(String[] args) {
		Phone p = new SmartDevice();
		Tablet t = new SmartDevice();
		Laptop l = new SmartDevice();
		
		p.chargeBattery();
		t.turnOff();
		l.turnOn();
		
	}

}
