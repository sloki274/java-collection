package collection;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Character> c=new LinkedList<Character>();
		
		c.add('f');
		c.add('g');
		c.add('d');
		c.addFirst('w');
		c.addLast('m');
	c.removeLast();
		System.out.println(c);
		
		
	}

}
