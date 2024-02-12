package vehicle;

public class Main {
	
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.startEngine();
		v1.stopEngine();
		Vehicle v2 = new MotorCycle();
		v2.startEngine();
		v2.stopEngine();
		Vehicle v3 = new Truck();
		v3.startEngine();
		v3.stopEngine();
	}

}
