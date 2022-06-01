package lecture3.hw_2;

public class Rectangle implements Shape{
	private double aLength;
	private double bLength;
	
	@Override
	public double getSquare() {
		return aLength * bLength;
	}
	
}
