import java.util.Scanner;
public class Passingarrytomethod {
static void min(int arr[])
{
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
			System.out.print(min);
		}
	}
	}
static void sort(int arr[])
{
int temp,i ,j;
for(i=0;i<arr.length;i++)
{
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	}
for(i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
	}
}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  n ,j,i;
		System.out.println("Enter the  size of Array");
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the Elements of Array");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
       System.out.println("The smallest no is :");
        min(a);
       System.out .println();
        System.out.println("The sorted Array is by:- Bubble sort");
        sort(a);
	}

}
