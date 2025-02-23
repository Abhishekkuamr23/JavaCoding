package javacoding.staticvariable;

public class PrivateInstance {
	
	static int num = 0;
	private static PrivateInstance pi = new PrivateInstance();
	
	private PrivateInstance() {
		num++;
	}
	
	public static PrivateInstance getInstance() {
		return pi;
	}
}
