package javacoding.abstraction;

public class Remote extends Television{

	Remote(int num, String name){
		super(num, name);
	}
   void turnOn() {
	   System.out.println("Turn on the TV");
   }
   
   void turnOff() {
	   super.display();
	   System.out.println("Turn off the TV");
   }
   
}
