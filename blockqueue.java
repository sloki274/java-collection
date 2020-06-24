package collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class blockqueue {
	
		
		
		// add large number of values => list, queue, set , map
		// dv
		// add objects
		// remove
		// searching
		// iterating 
		// grow its size 
		
		
		public static void main(String[] args) {
			
			
	// queue => added at the last, first removal => FIFO 
			// Araybloking, prio que, deque 
			// not index based 
			// queue <datatype> name = new nameofqueue<datatype>(memoryspace)
			
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		// head data tail 
		q1.add(10);
		q1.add(50);
		q1.add(100);
		
		
		//trying add element to a full queue 
		//q1.add(200);
		
		
		
		for(Integer x: q1)
		{
			System.out.println(x);
		}
		
		q1.remove();// removed from first 
		System.out.println("after removal");
		for(Integer y: q1)
		{
			System.out.println(y);
		}
		
		// peek => return the element in head of the queue
		
		System.out.println("Element in the head is  "+  q1.peek());
		
		// remove again
		
		q1.remove();
		System.out.println("After removing second elemnt");
		for(Integer z: q1)
		{
			System.out.println(z);
		}
		System.out.println("Element in the head is  "+q1.peek());
		
		
		q1.remove();
		System.out.println("removing last element");
		for(Integer z1: q1)
		{
			System.out.println(z1);
		}
		System.out.println(q1.peek());
		
		// queue is empty
		
		q1.remove();
		
		}
		
		
		
	}



