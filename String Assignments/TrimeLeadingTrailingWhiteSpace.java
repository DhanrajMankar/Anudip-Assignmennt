package Dhanarjanudip06;

import java.util.Scanner;

public class TrimeLeadingTrailingWhiteSpace {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The String");
		String a1=s.next();
		a1.stripLeading();
		a1.stripTrailing();System.out.println(a1);
		
	}

}