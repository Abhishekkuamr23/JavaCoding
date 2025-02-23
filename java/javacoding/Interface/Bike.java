package javacoding.Interface;

public class Bike implements Vehicle{

	@Override
	public void color() {
		System.out.println("Bike of car is black");
	}

	@Override
	public void startEngine() {
		System.out.println("Bike engine is started");
	}
	
	@Override
	public void stopEngine(){
		System.out.println("Bike engine stopped");
	}
	
	public void service(String name) {
        System.out.println("Vehicle is being serviced." + name);
    }
	
	public void service() {
        System.out.println("Vehicle service has done.");
    }
}
