package javacoding.Interface;

public interface Vehicle {

	int maxSpeed = 120;
	
	void color();
	
	void startEngine();
	
	default void stopEngine(){
		System.out.println("Color of viechle");
	}
	
	static void service(String name) {
        System.out.println("Vehicle is being serviced." + name);
    }
	
	static void service() {
        System.out.println("Vehicle service has done.");
    }
	
	// nested interface
	interface Maintenance {
        void performMaintenance();
    }
	
	//nested class
	class Engine {
		
		public void Engine() {
			System.out.println("Engine class called");
		}
		
        void checkEngine() {
            System.out.println("Checking engine...");
        }
    }
	
	enum VehicleType {
        CAR, TRUCK, MOTORCYCLE;
    }
}
