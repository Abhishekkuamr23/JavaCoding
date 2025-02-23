package javacoding.MapCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> num = new HashMap<>();
		
		//num.put();
		num.put("Arun", 2);
		num.put("Raman", 2);
		num.put("Inder", 2);
		num.put("Jitinder", 2);

		System.out.println(num);
		
		//num.containsKey(key);
		//num.containsValue(value);
		if(!num.containsKey("dum")) {
			num.put("dum", 5);
		} else{
			System.out.println("key is in the list");
		}
		
		//num.putIfAbsent("All", 3);
		num.putIfAbsent("All", 3);
		
		//Map.Entery
		//num.entrySet()
		for(Map.Entry<String, Integer> e: num.entrySet())
		{
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//num.get(key);
		System.out.println(num.get("Arun"));
		System.out.println(num.get(3));
		
	
		
		System.out.println(num.size());
		
		System.out.println(num.isEmpty());
		
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		
		num.clear();
		
		System.out.println(num);
		
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("B", "Banana");
		treeMap.put("A", "Apple");
		
		System.out.println(treeMap);
		
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("A", "Apple");
		linkedHashMap.put("B", "Banana");

		System.out.println(linkedHashMap);
	}

}
