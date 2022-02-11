package Dhanarjanudip06;

import java.util.Arrays;

public class NumericAndStringArraySort {

	public static void main(String[] args)
	{
		/*numeric array sort*/
		int a[]= {10,23,45,12,2,3,4,56};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		 {System.out.println(a[i]);}
		
		
		/*String array sort*/
		String b[]= {"dhanraj","raj","ajay","red"};
		Arrays.sort(b);
		for(int i=0;i<b.length;i++)
		 {System.out.println(b[i]);}
	}
	
}

