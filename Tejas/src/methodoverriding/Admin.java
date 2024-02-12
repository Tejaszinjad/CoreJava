package methodoverriding;

public class Admin extends Employee{
	
	@Override
    void applyForLeave() {
		System.out.println("I am Admin,I want 5 days leave.");
	}

}
