package Dhanarjanudip06;

public class StudentsClass 
   {
	public int id;
	public String name;
	
	public static void main(String[] args)
	{
		StudentsClass obj1=new StudentsClass ();
		obj1.id=12;
		obj1.name="dhanraj";
		
		System.out.print("The name is"+ obj1.name);
		System.out.print("The id no is"+ obj1.id);
	}
   }
