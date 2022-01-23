import java.util.Scanner;
public class Array {
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
		for(i=0;i<j;i++)
		{
			temp=a[i];
			sum=sum+temp;
		}
		avg=sum/j;
	    System.out.println("The average of no are"+avg);
	}
}
