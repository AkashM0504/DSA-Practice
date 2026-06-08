package Lists;

import java.util.*;

public class ArrayList_Operations {
	
	public static void anotherlist(List<Integer> list2) {
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		System.out.println(list2);
	}
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<Integer>();
		anotherlist(list2);
		
		//adding- add(Object obj)
		list1.add(10);
		list1.add(20);
		
		//add(int index, object obj)
		list1.add(0,0);
		list1.add(3,30);
		list1.add(4,40);
		System.out.println(list1);
		
		list1.addAll(list2);
		System.out.println(" ");
		System.out.println("List1 and List2 are Merged: "+list1);
		
		//removing
//		list1.remove(0);
//		list1.removeAll(list2);
//		System.out.println(list1);
//		//retain
//		list1.retainAll(list2);
//		System.out.println(list1);
		
//		list1.clear();
//		System.out.println(list1);
		
		//contains
		System.out.println(list1.contains(20));
		System.out.println(list1.containsAll(list2));
		System.out.println(list1);
		
		//get
		System.out.println(list1.get(0));
		//set
		System.out.println(list1.set(1,1000));
		System.out.println(list1);
	}
}
