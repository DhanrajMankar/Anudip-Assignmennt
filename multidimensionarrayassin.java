package Dhanarjanudip06;

import java.util.Scanner;

public class multidimensionarrayassin {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the of single dimension array size");
			int n,m,b;
			System.out.println("Enter the no of rows");
			n=sc.nextInt();
			System.out.println("Enter the no of coloums");
			m=sc.nextInt();
			System.out.println("Enter the elemmrnts of  Array");  
			int[][]a=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{	
				a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{	
					System.out.print(" "+a[i][j]);
				}
				System.out.println();
			}
	}

}
