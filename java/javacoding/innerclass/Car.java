package javacoding.innerclass;

public class Car {

	public int num;
	private String model;
	private boolean isEngineOn;
	
	public Car(String model) {
		this.model = model;
		this.isEngineOn = isEngineOn;
	}
	
	class Engine{
		void start() {
			if(!isEngineOn) {
				isEngineOn = true;
				System.out.println(model + "start engine");
			}
			else
			{
				System.out.println(model + "engine is already started");
			}
			
		}
		
		void stop() {
			if(isEngineOn) {
				isEngineOn = false;
				System.out.println(model + "stop engine");
			}
			else
			{
				System.out.println(model + "engine is already stopped");
			}
		}
	}
}
