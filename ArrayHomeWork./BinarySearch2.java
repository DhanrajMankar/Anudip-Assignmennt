package Dhanarjanudip01;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		int counter,num,item,arry[],first,middle,last;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements");
	    num=s.nextInt();	
	    arry=new int[num];
	    Arrays.sort(arry);
	    System.out.println("enter"+num+"integer");
	    for (counter = 0; counter < num; counter++)
	          arry[counter] =s.nextInt();

	      System.out.println("Enter the search value:");
	      item=s.nextInt();
	      first = 0;
	      last = num - 1;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( arry[middle] < item )
	           first = middle + 1;
	         else if ( arry[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	}  
}