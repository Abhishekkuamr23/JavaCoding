package javacoding.staticvariable;

public class StaticVariableMethod {
	 public static int count = 0;
	 
	 public static String name = "Aman";
	 
	 public StaticVariableMethod() {
		 count++;
	 }
	 
	 public static void getCount() {
		 System.out.println("Total count : " + count++);
	 }
	 
	 static {
		 getCount();
	 } 
}
