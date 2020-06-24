package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Queue<String>name=new PriorityQueue<String>();
	name.add("loki");
	name.add("mom");
	name.add("varun");
	
	
	for (String c:name) {
	      System.out.println(c);
	}
	
	name.remove();
	
System.out.println("after removal");
	for (String x:name) {
	      System.out.println(x);
	}
	
	}
	
}