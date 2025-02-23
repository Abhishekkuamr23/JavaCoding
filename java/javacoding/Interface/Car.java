package javacoding.Interface;

public class Car implements Vehicle{

	@Override
	public void color() {
		System.out.println("Color of car is blue");
	}

	@Override
	public void startEngine() {
		System.out.println("Car engine is started");
	}
	
	@Override
	public void stopEngine(){
		System.out.println("Car engine is stopped");
	}
}
