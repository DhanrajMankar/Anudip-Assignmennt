package Dhanarjanudip06;

import java.util.Scanner;

public class singledimension {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the of single dimension array size");
			int n,b;
			n=sc.nextInt();
			System.out.println("Enter the elemmrnts of  Array");  
			int[]a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("The elements of  Array");
			for(int i=0;i<n;i++)
			{
						System.out.println(a[i]);
		}
	}

}
