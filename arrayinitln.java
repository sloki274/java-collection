package array;

import java.util.Scanner;

public class arrayinitln {
	public static void main(String[] args) {
		// datatype [] name={value1,value2, value3... valuen}
		
		String writing[]={"pen","pencil","scale"};
		for(int i=0;i<writing.length;i++)
		{
			System.out.println(i + ":"+ writing[i]);
		}
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the index");
		int index =sc.nextInt();
		System.out.println(writing[index]);
	
	}
	}

