package collection;

import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.Map;

import java.util.TreeMap;


public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Map <String,Integer> s=new TreeMap<String, Integer>();
		
		s.put("joey",1);
		s.put("rach",10);
		s.put("chand",24);
		s.remove("rach",32);
		System.out.println(s);
		Map <Integer,String> m2=new LinkedHashMap<Integer,String>();


	       
	       m2.put(20,"rose");	
	         m2.put(50,"jasmine");

	     	System.out.println(m2);
	     	
	     	
	     	Map <Integer,Character> n=new HashMap <Integer,Character>();
		       
	         n.put(10,'c');	
	         n.put(5,'d');

	     	System.out.println(n);
	    	Map<Integer,String> m= new TreeMap<Integer,String>();
	    	m.put(4, "c#");
	    	m.put(0, "java");
	    	m.put(2, "python");
	    	// natural ordering 
	    	System.out.println(m);
	    	
	    	
	    	
	    	Map<Character,String>m4=new TreeMap<Character,String>();
	    	m4.put('b', "banana");
	    	m4.put('a', "apple");
	    	System.out.println(m4);
	    	
	    	Map<String,String>ms=new TreeMap<String,String>();
	    	ms.put("name", "dhivya");
	    	ms.put("id", "five");
	    	System.out.println(ms);
	    	
		
	}

}
