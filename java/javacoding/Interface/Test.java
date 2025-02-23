package javacoding.Interface;

public class Test {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Bike bike1 = new Bike();
		car.color();
		bike.color();
		
		car.startEngine();
		bike.startEngine();
		
		car.stopEngine();
		bike.stopEngine();
		
		Vehicle.service("CAMERY");
		Vehicle.service("RE");
		bike1.service();
		bike1.service("Bullet");
		
		Vehicle.Engine mn = new Vehicle.Engine();
		mn.checkEngine();
		
        Vehicle.Maintenance maintenance = new Vehicle.Maintenance() {
            @Override
            public void performMaintenance() {
                System.out.println("Performing maintenance on the vehicle.");
            }
        };
        maintenance.performMaintenance(); 
        
        Vehicle.VehicleType type = Vehicle.VehicleType.CAR;
        System.out.println("Vehicle Type: " + type); 
	}
}
