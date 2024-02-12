package vehicle;

public class MotorCycle extends Vehicle{
	@Override
    void startEngine(){
		System.out.println("Motor Cycle engine start");
	}
	
	void stopEngine() {
		System.out.println("Motor Cycle engine stop");
	}

}
