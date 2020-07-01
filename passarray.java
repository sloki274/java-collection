package array;

public class passarray {
	public static void main(String[] args) {
		
		int a[]={1,4,6,6,9,0};
		min(a);
	}
	// find the minimum value

	public static void min(int a[])
	{
		int min=a[3];
		for(int i=0;i<a.length;i++)
		{
			if( min>a[i])
				min=a[i];
				
		}
		System.out.println(min);
	}


/*min a[3]
 * 6>1 => true,
 * 6>4 =>true, 
 *  6>6,=>true
 * 6>9,=>true
 *  6>0 => true   ??????
 *  
 *  
 * /  
 */






