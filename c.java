
public class c {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write code which returns following
		// o/p: 11,23,35,47,59
		
		
    /* for(int i=11;i<60;i=i+12)
     {
    	 System.out.print(i+",");
     }*/
		int sum=0;
		for(int i=55;i<86;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
			
		}
		System.out.println("sum is   "+sum);
		
	}

}

//select marks,sname
//from student
//where id>5 and id<10;
