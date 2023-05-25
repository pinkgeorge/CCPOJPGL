package Inheritance_Overriding;

public class U_SpyPlane extends Vehicle {
	
	int wingSpan = 117;
	
	public void fly() {
		System.out.println("The Plane has taken off");
		
	}
	
	@Override
	void stop() {
		super.stop();
	}

}
