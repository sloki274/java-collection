package array;


public class clone {
	public static void main(String[] args) {
		
		
		String a[]= {"loki","mom","dad","sis"};
		
		System.out.println("original array");
		
		

	
	for(int i=0;i<a.length;i++) {
		
		
		System.out.println(a[i]);
	}

	
	
	
	System.out.println(" cloned original array");
	
	String b[]=a.clone();


for(int i=0;i<a.length;i++) {
	
	
	System.out.println(b[i]);
}
}
}
