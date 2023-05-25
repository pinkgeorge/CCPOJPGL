package Inheritance_Overriding;

public class FandangoYacht extends Vehicle {
	
	String mainSailColor = "Red";

	public void Float() {
		System.out.println("The Boat is currently sailing");
		
	}
	
	@Override
	void stop() {
		super.stop();
	}

}
