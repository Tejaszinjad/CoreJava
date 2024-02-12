package vehicle;

public class Car extends Vehicle{
	@Override
    void startEngine(){
		System.out.println("Car engine start");
	}
	
	void stopEngine() {
		System.out.println("Car engine stop");
	}

}
