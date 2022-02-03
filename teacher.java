package Dhanarjanudip06;
public class teacher {
	void teach()
	{
	System.out.println("Teaching subject");	
	}
 }
class Student extends teacher{
	void listen()
	{
		System.out.println("Listening");
	}
}
class homeTution extends Student{
	void explains()
	{
		System.out.println("Does homework");
	}
	public static void main(String[] args) {
		homeTution h=new homeTution();
		Student h1=new Student();
		teacher h2=new teacher();
        h.explains();
        h1.listen();
        h2.teach();
        
	}


	}


