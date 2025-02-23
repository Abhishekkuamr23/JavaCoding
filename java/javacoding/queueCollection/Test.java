package javacoding.queueCollection;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<Integer> num  = new PriorityQueue<>();
		
		num.offer(4);
		num.offer(3);
		num.offer(5);
		num.offer(2);
		num.offer(1);
		num.offer(7);
		
		System.out.println(num);
		
		List<Integer> list = Arrays.asList(5, 1, 3, 2, 4);
		PriorityQueue<Integer> queue = new PriorityQueue<>(list.size(), Comparator.naturalOrder());
		queue.addAll(list);
		
		System.out.println(queue);
		
		PriorityQueue<Integer> num2  = new PriorityQueue<>(Comparator.reverseOrder());

		num2.add(4);
		num2.add(3);
		num2.add(5);
		num2.add(2);
		num2.add(1);
		num2.add(7);
		num2.offer(8);
		
		System.out.println(num2);
		
		System.out.println(num.peek());
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99, 22, 44, 43));
		num.addAll(numbers);
	
		System.out.println(num);

	}

}
