package lecture3.hw_2;

public class Circle implements Shape{
	private double radius;
	
	@Override
	public double getSquare() {
		return radius * radius * Math.PI;
	}
	
}
