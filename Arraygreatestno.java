import java.util.Scanner;
public class Arraygreatestno{
	public static void main(String[] args) {
		int temp,i,j,sum=0;
		float avg;
		System.out.println("Emter the size of array");
		Scanner sc=new Scanner(System.in);
		j=sc.nextInt();
		int a[]=new int[j];
		System.out.println("Emter the no");
		for(i=0;i<j;i++)
		{
			a[i]=sc.nextInt();
		}
		temp=a[0];
		for(i=1;i<j;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
	 System.out.println("The greatest no is="+temp);
	}
	}