package interface1;

public class Square implements GeometricShape {
	@Override
	public void draw() {
		System.out.println("Draw square");
	}
	@Override
    public void resize() {
    	System.out.println(" Resize square");
	}
	@Override
    public void rotate() {
    	System.out.println("rotate square");
	}

}
