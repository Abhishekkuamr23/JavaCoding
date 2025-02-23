package javacoding.abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote rm = new Remote(200, "LG");
		System.out.println(rm.num + " " + rm.name);
		rm.turnOn();
		rm.turnOff();
	}

}
