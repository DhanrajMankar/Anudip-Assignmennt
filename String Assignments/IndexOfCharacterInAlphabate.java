package Dhanarjanudip06;

import java.util.Scanner;

public class IndexOfCharacterInAlphabate {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The String");
		String a1=s.next();
		for(int i=0;i<a1.length();i++)
		{
		System.out.println(a1.charAt(i)+"="+i);
		}
	}

}
