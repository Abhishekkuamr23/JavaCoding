package javacoding.casting;

public class DownCasting {

	public static void main(String[] args) {
		Animal dog = new Dog(); //parent reference  -> Child object
		
		Dog newDog = (Dog)dog; //Child reference  -> Parent reference
	}

}
