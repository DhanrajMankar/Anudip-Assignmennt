package Dhanarjanudip06;

import java.util.Arrays;
import java.util.Scanner;
public class SecondFrequencyString {

	public static void main(String[] args) {
		int []a5=new int[26];
		int []a6=new int[26];
		
		int t=0;
		
		char a[]= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter The String");
		String a1=s.next();
		for(int j=0;j<26;j++)
		{
			char b= a[j];
		for(int i=0;i<a1.length();i++)
		{
			char c=a1.charAt(i);
			if(b==c)
			{
				a5[j]++;
            }
	     }
		
	}
		for(int j=0;j<26;j++)
		{
			a6[j]=a5[j];
		}
		Arrays.sort(a6);
		for(int n=0;n<26;n++)
		{
			if(a5[n]==a6[24])
			{
			 System.out.print("Second no highest occuring char is "+a[n]);
			 System.out.print(" = "+a5[n]);
			 System.out.println();
			}
		}
	
		}
	
}




