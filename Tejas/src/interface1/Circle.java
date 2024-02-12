package interface1;

public class Circle implements GeometricShape{
	@Override
	public void draw() {
		System.out.println("Draw circle");
	}
	@Override
    public void resize() {
    	System.out.println("Resize circle ");
	}
	@Override
    public void rotate() {
    	System.out.println("rotate ciecle..");
	}

}
