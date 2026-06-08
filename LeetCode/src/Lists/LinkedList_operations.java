package Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList_operations {
	public static void anotherlist(List<String> list2) {
		list2.add("Virat");
		list2.addFirst("Rajat");
		list2.addLast("Romario Shepherd");
		list2.addLast("Tim David");
	}
	
	public static void important() {
		Queue<String> l1=new LinkedList<String>();
		l1.add("Rohit Sharma");
		l1.add("Hardik Pandya");
		l1.add("Bumrah");
		l1.add("Tilak Verma");
		
		//peek()
		System.out.println(l1.peek());
		System.out.println(l1);
		//poll()
		System.out.println(l1.poll());
		System.out.println(l1);
		//offer()
		l1.offer("SKY");
		System.out.println(l1);
	}
	
	public static void main(String[] args) {
		List<String> list1=new LinkedList<String>();
		List<String> list2=new LinkedList<String>();
		anotherlist(list2);
		//add
		list1.add("AB De Villiers");
		list1.add(0, "Gayle");
		list1.addAll(list2);
		
		System.out.println(list1);
		
		//get
		System.out.println(list1.get(0));
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		
		//set
		System.out.println(list1.set(0, "Chris Gayle"));
		System.out.println(list1);
		
		//size
		System.out.println(list1.size());
		//isEmpty
		System.out.println(list1.isEmpty());
		//contains
		System.out.println(list1.contains("Chris Gayle"));
		System.out.println(list1.containsAll(list2));
		
		//clear()
//		list1.clear();
//		System.out.println(list1);
		
		//toArray
//		Object[] arr=list1.toArray();
//		for(Object names:arr) {
//			System.out.println(names);
//		}
		
		//remove()
		list1.remove(0);
		list1.remove("Chris Gayle");
		list1.removeFirst();
		list1.removeLast();
		System.out.println(list1);
		important();
	}
}
