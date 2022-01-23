import java.util.Scanner;
public class inheritace2 extends inhertace{
	public static void cal(int cost,int price)
	{int profit;
	profit=price-cost;
	System.out.println("the prift ="+profit);
	}
	public static void main(String []args)
	{   
		int cost,price,n1,n2,n3;
		System.out.println(" Enter cost");
		Scanner sc=new Scanner(System.in);
		cost=sc.nextInt();
		System.out.println(" Enter Price");
		price=sc.nextInt();
	    cal(cost,price);
	    System.out.println(" Enter three no");
	    n1=sc.nextInt();
	    n2=sc.nextInt(); 
	    n3=sc.nextInt();
		greatest(n1,n2,n3);
	}
}
