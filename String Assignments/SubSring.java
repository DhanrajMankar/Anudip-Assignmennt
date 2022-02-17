package Dhanarjanudip06;

import java.util.Scanner;

public class SubSring {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The String");
		String a1=s.next();
		System.out.println("Enter the index From which you Want a new String");
		int a=s.nextInt();
		if(a<a1.length())
		{
		System.out.println(a1.substring(a));	
		}
		else {System.out.println("Srinng is  too  Short for getting a Sub String");}
	}

}
