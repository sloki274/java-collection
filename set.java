package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <String> s=new TreeSet<String>();
		
		s.add("joey");
		s.add("rach");
		s.add("chand");
		s.remove("rach");
		System.out.println(s);
		

		Set <Integer>h=new LinkedHashSet <Integer>();
	       
	         h.add(20);	
	         h.add(50);

	     	System.out.println(h);
	     	
	     	
	     	Set <Integer> n=new HashSet <Integer>();
		       
	         n.add(10);	
	         n.add(5);

	     	System.out.println(n);
	     	
	}

	


}


