package Dhanarjanudip06;
import java.util.Scanner;
public class feb12022 
{
public static void main(String[] args) {
		
			int num1,num2,num3,sum,average,product,largest,smallest;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first num: ");
			num1=sc.nextInt();
			System.out.println("enter the second num: ");
			num2=sc.nextInt();
			System.out.println("enter the third num: ");
			num3=sc.nextInt();
			
			sum=num1+num2+num3;
			average=sum/3;
			product=num1*num2*num3;
			
			System.out.println("The num add is "+sum);
			System.out.println("The num average is "+average);
			System.out.println("The num product is "+product);
			largest=num2;
			if(num1>num2)
			{
				largest=num1;
			}
			if (num3>largest)
			{
			    largest=num3;
			}
		  
			
				System.out.println(largest+"is larger");
		    smallest=num1;
		    if(num1>num2)
		    { smallest=num2;}
		    if(num3<smallest)
		    {smallest=num3;}
		    System.out.println(smallest+"is smallest");
		
		}
	

		
	}


