package javacoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;
public class StreamCodingPractice {
	
	@Test(priority = 1, enabled = false)
	public void arraylistMethod1() {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(4);
		arrList.add(5);
		arrList.add(7);
		arrList.add(8);
		arrList.add(10);
		
		List<Integer> newNum = new ArrayList<Integer>();
		
		for(int i = 0; i< arrList.size(); i++) {
			int newNumber = arrList.get(i); 
			if(newNumber == 7) {
				System.out.println(newNumber);
			}
		}
		
		for(int num : arrList) {
			newNum.add(num);
		}
		
		System.out.print(newNum);
	}
	
	@Test(priority = 2, enabled = false)
	public void arraylistMethod2() {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Aman");
		arrList.add("Shanti");
		arrList.add("peace");
		arrList.add("restin");
		arrList.add("koma");
		
		List<String> newNum = new ArrayList<String>();
		
		for(int i = 0; i< arrList.size(); i++) {
			String newString = arrList.get(i); 
			if(newString.startsWith("p")) {
				System.out.println(newString);
			}
		}
		
		for(String num : arrList) {
			newNum.add(num);
		}
		
		System.out.print(newNum);
	}
	
	@Test(priority = 3, enabled = false)
	public void streamFilter() {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("aman");
		arrList.add("shanti");
		arrList.add("peace");
		arrList.add("restin");
		arrList.add("koma");
		arrList.add("arsh");
		arrList.add("asdkoma");
		arrList.add("akoma");
		
		
		long totalACount = arrList.stream().filter(s->s.contains("A")).count();
		System.out.print(totalACount);
		
		// direact creating stream
		long cnt = Stream.of("aman", "ali", "anuj", "ankita").filter(s->
		{
			s.contains("A");
			return false;
		}
		).count();
		
		System.out.print(cnt);
		
		//print all the element from an array
		arrList.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
	

	@Test(priority = 4, enabled = false)
	public void mapMethod() {
		
		Stream.of("aman", "ali", "anuj", "ankita").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//System.out.print(cnt);
		
		//converting into list
		List<String> arList = Arrays.asList("aman", "ali", "anuj", "ankita", "kaalu", "kabm", "kcsma");
		arList.stream().filter(s->s.startsWith("k")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	@Test(priority = 5, enabled = false)
	public void concatTwoStreams() {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("aman");
		arrList.add("shanti");
		arrList.add("peace");
		arrList.add("restin");
		arrList.add("koma");
		arrList.add("arsh");
		arrList.add("asdkoma");
		arrList.add("akoma");
		
		//converting into list
		List<String> arList1 = Arrays.asList("ali", "anuj", "ankita", "kaalu", "kabm", "kcsma");
		
		//merge two stream list
		Stream<String> newString  = Streams.concat(arrList.stream(), arList1.stream());
		//newString.sorted().forEach(s->System.out.println(s));
		
		boolean flag  = newString.anyMatch(s->s.equalsIgnoreCase("aman"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 6, enabled = true)
	public void collectStreams() {
		
		List<String> str = Stream.of("aman", "ali", "anuj", "ankita").filter(s->s.endsWith("j")).map(s->s.toUpperCase()).collect(Collectors.toList());
	   
	    System.out.println( str.get(0));
	    
	    List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 5);
	    
	    num.stream().distinct().forEach(s->System.out.println(s));
	    num.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println( str.get(2));
	}
	
}

