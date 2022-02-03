package Dhanarjanudip06;
import java.util.Scanner;
public class LargerInteger {
	public static void main(String[] args)
	{
		int  num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num: ");
		num1=sc.nextInt();
		System.out.println("enter the second num: ");
		num2=sc.nextInt();
		if(num1==num2)
		{
			System.out.println("Both no are same");
		}
		else
		   {
			if(num1<num2)
			    {
				System.out.println("Second no is larger"+num2);
				}
			else
			   {
				System.out.println("Frist no is larger"+num1);
				}
			}
		}
}