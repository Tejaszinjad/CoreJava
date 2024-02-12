package interface1;

public class Main {
	
	public static void main(String[] args) {
		GeometricShape gs1 = new Circle();
		gs1.resize();
		
		GeometricShape gs2 = new Square();
		gs2.draw();
		
		GeometricShape gs3 = new Triangle();
		gs3.draw();
		
		
	}

}
