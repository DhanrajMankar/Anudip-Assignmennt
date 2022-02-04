package Dhanarjanudip06;

import java.util.Scanner;

public class arrayassinmentdecending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of aray");
		int n,b;
		n=sc.nextInt();
		System.out.println("Enter the elemmrnts of  Array");  
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
				 b=a[i];
				 a[i]=a[j];
				 a[j]=b;
				}
			}
		}
		System.out.println("The Decending elemmrnts of  Array");
		for(int i=0;i<n;i++)
		{
					System.out.println(a[i]);
	}

}
}
