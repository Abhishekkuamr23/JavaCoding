package javacoding.staticvariable;

public class Test {
	public static void main(String[] args) {
		StaticVariableMethod st = new StaticVariableMethod();
		StaticVariableMethod st1 = new StaticVariableMethod();
		StaticVariableMethod st2 = new StaticVariableMethod();
		StaticVariableMethod st3 = new StaticVariableMethod();
		
		System.out.println(StaticVariableMethod.count);
		System.out.println(StaticVariableMethod.name);
		StaticVariableMethod.getCount();
		StaticVariableMethod.getCount();
		StaticVariableMethod.getCount();
		StaticVariableMethod.getCount();
		
		PrivateInstance.getInstance();
		System.out.println(PrivateInstance.num);
		
	}
}
