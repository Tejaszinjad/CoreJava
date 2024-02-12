package methodoverriding;

public class Manager extends Employee {
	@Override
    void applyForLeave() {
	System.out.println("I am Manager,I want 2 weeks leave.");	
	}
 
}
