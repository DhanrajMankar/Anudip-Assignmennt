package Dhanarjanudip06;

import java.util.Scanner;

public class IgnoringCase {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first String");
		String a1=s.next();
		System.out.println("Enter second String");
		String a2=s.next();
		System.out.println(a1.equalsIgnoreCase(a2));
		

	}

}
