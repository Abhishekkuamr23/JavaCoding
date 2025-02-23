package javacoding.SetCollection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Test {

	public static void main(String[] args) {
		
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student("Ram", 3));
		studentSet.add(new Student("Aman", 4));
		studentSet.add(new Student("Ali", 5));
		studentSet.add(new Student("Jagi", 4));

		Student s1 = new Student("Goru", 4);
		Student s2 = new Student("Jan", 6);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(studentSet);
		
		//Collections.sort(studentSet);
		Set<String> name = new HashSet<>();
		
		//name.add(value)
		name.add("Aman");
		name.add("Anuj");
		name.add("Karan");
		name.add("snuj");
		
		System.out.println(name);
		
		//name.contains(value)
		if(name.contains("Rohan")) {
			System.out.println("true");
		}
		else {
			name.add("Rohan");
		}
		
		//name.remove(value);
		name.remove("Karan");
		
		System.out.println(name);
		
		for(String str: name) {
			System.out.println(str);
		}
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(3);
		linkedHashSet.add(5);
		linkedHashSet.add(2);
		linkedHashSet.add(1);
		System.out.println(linkedHashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(1);
		
		System.out.println(treeSet);
		
	}

}
