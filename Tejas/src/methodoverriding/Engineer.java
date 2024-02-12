package methodoverriding;

public class Engineer extends Employee {
	@Override
    void applyForLeave() {
		System.out.println("I am Engineer,I want 1 week leave.");
	}

}
