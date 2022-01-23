import java.util.Scanner;
public class Function {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two no");
			int a,b,sum;
			a=sc.nextInt();
			b=sc.nextInt();
			fun(a,b);
			System.out.println();
			fun1(a,b);
			sum=fun2(a,b);
			System.out.print("the sum is"+sum);
		}
			public static void fun(int a,int b)
			{
				int temp,temp1;
				temp1=b;
				temp=a;
				b=temp;
				a=temp1;
				System.out.println("two no are");
				System.out.print(a);
				System.out.print(b);
			}
			public static void fun1(int a,int b)
			{
				b=a+b;
				a=b-a;
				b=b-a;
				System.out.println("two no are");
				System.out.print(a);
				System.out.print(b);
			}
			public static int fun2(int a,int b)
			{
				int x,y,sum;
				sum=a+b;
				return (sum);
			}
		}
		
