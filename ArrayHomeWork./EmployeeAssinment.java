package Dhanarjanudip06;

public class EmployeeAssinment {
	private int id;
	private String name;
	private int salary;

	
public int getId() {
		return id;
	}


	public void setId(int id) {
	
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


public static void main(String[] args)
 {
	 EmployeeAssinment obj=new  EmployeeAssinment();
	 obj.setId(12);
	 obj.setName("Dhanraj");
	 obj.setSalary(8000);
	 
	 System.out.println("The id is  "+obj.getId());
	 System.out.println("The name is "+obj.getName());
	 System.out.println("The salary is "+obj.getSalary()+"rs");
 }

}
