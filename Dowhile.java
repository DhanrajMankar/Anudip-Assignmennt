import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub5
 Scanner sc=new Scanner(System.in);
 int i,j;
 System.out.println("enter the size of arry");
 j=sc.nextInt();
 int[]num=new int[j];
 System.out.println("enter the values");
 for(i=0;i<j;i++)
 {
	 num[i]=sc.nextInt();
 }
 System.out.println("enter the values are");
 for(i=0;i<j;i++)
 {
	 System.out.println(num[i]+"\n");
 }
}
}