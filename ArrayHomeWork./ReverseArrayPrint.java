package Dhanarjanudip06;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayPrint {

	public static void main(String[] args) {
		System.out.println("Enter the no of elements of Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(i>0)
			{
				for(int j=0;j<=i;j++)
			
			{
			        if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
			}
			}
			}
			
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
}}	


