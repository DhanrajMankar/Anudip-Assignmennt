import java.util.Scanner;
public class Function2
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 int a,b,c,d,e,f,sum;
	 float p;
	 System.out.println("Enter the marks of student");
    a= sc.nextInt();
    b= sc.nextInt();
    c= sc.nextInt();
    d= sc.nextInt();
    e= sc.nextInt();
    f= sc.nextInt();
    p=frist(a,b,c,d,e,f);
 }
 public static int frist(int a,int b,int c,int d,int e,int f)
 {   int sum;
	 float p;
	 sum=a+b+c+d+e+f;
	 p=(sum*100)/600;
	 if(p>90) {
		 System.out.print(p);
		 System.out.println("Frst class");
		 
	 }
	 else if(p>75&&p<90)
	 { System.out.print(p);
		 System.out.println("Second class"); 
		
	 }
	 else if(p<75&&p>=50)
	 { System.out.print(p);
		 System.out.println("Third class");
		 
	 }
	 else if(p<50)
	 { System.out.print(p);
		 System.out.println("Sorry you have to reapear for the exam "); 
		 
	 }
	 return (p);
	 
 }
}