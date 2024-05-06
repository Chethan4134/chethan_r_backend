package programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Example2LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> marks = new LinkedHashMap<String, Integer>();
		
		marks.put("Chethan", 67);
		marks.put("Akash", 76);
		marks.put("Scahin", 89);
		
		Iterator<String> iterator = marks.keySet().iterator();
		
		while (iterator.hasNext()) {
//			System.out.println(iterator.next()+ "-------->"+marks.get(iterator.next()));
			// NoSuchElementException    
			// Instead of this we use 
			String str =iterator.next();
			System.out.println(str + "------>" + marks.get(str));
		}
		
		System.out.println("=====================================");
		
		Set<Entry<String,Integer>> entrySet = marks.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"------>" + entry.getValue());
		}
		
	}
}
