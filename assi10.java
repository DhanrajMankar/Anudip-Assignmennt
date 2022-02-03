package Dhanarjanudip06;

public class assi10  
   {
	int i; 
	void display() 
	{ 
	System.out.println(i);
	 } } 
	class B extends assi10 
	 { 
		int j;  
	void display()
	 {
	 System.out.println(j); 
	} } 
	class method_overriding 
	{ 
	public static void main(String args[]) 
	{
	 B obj = new B(); obj.i=1; obj.j=2; obj.display();
	 } }

