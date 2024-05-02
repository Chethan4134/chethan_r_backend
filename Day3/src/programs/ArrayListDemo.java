package programs;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(6);
		
//		for(Object ele:list) {
//			System.out.println(ele);
//		}
		
		
//		list.forEach(ele ->System.out.println(ele));
		
//		list.forEach(System.out :: println);
		
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Integer temp = iterator.next();
			if(temp==3) {
				iterator.remove();
			}System.out.println(temp);
		}
		
		
	}
}

