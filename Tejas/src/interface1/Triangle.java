package interface1;

public class Triangle implements GeometricShape{
	@Override
	public void draw() {
		System.out.println("Draw triangle");
	}
	@Override
    public void resize() {
    	System.out.println("Resize shape of triangle");
	}
	@Override
    public void rotate() {
    	System.out.println("rotate triangle");
	}

}
