package javacoding.abstraction;

abstract class Television {
	abstract void turnOn();
	abstract void turnOff();
	public int num;
	public String name;
	
	Television(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Display 4k HD");
	}
	
	static{
		System.out.println("Television always have body");
	}
}
