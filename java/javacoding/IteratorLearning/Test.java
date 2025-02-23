package javacoding.IteratorLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//add element
		list.add("Apple");
		list.add("Banana");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
	}

}
