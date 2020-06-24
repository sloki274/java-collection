package collection;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				// arraylist and linked list
				// number of elements
				// allow duplicates
				// index based 
				
				// values will added at the end
				// will be removed accoring to the index value passed
				
				
				// linked list
				// add first, add last
				// remove first, remove last
				
				List<Integer>l1= new ArrayList<Integer>();
				l1.add(10);
				l1.add(30);
				l1.add(40);
				l1.add(10);
				System.out.println(l1);
				// last occurance of an element
				System.out.println(l1.lastIndexOf(10));
				
				
			// which element is in particular index value
				// get => obj.get
				
				System.out.println(l1.get(0));
				
				
				// remove an element
				
				l1.remove(0);
				System.out.println(l1);
				
				
				System.out.println(l1.subList(0, 2)); 
				System.out.println(l1.subList(1, 3));// o 1
				
				// search 
				System.out.println(l1.contains(10));
				System.out.println(l1.isEmpty());
				System.out.println(l1.size());// number of elements present


	
	
	
	
	}
	
	
	

}
