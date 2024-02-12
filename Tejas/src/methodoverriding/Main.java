package methodoverriding;

public class Main {
	
	public static void main(String[] args) {
		Employee e1 = new Manager();
		e1.applyForLeave();
		Employee e2 = new Engineer();
		e2.applyForLeave();
		Employee e3 = new Admin();
		e3.applyForLeave();
	}

}
