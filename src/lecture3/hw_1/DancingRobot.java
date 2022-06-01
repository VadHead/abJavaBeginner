package lecture3.hw_1;

public abstract class DancingRobot {
	
	public String getDefaultDanceType() {
		return getDanceType1();
	}
	
	public abstract String getDanceType1();
	
	public abstract String getDanceType2();
	
}
