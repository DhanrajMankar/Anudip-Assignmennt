
public class A {

	public static void main(String[] args) {
		String name="mohinee mankar";
		String m = "aeiou";
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<m.length();j++)
		
			{
				if(name.charAt(i)==m.charAt(j))
				{
					System.out.println(name.charAt(i)+"  "+i);
				}
				
				
			}
		}
		
		String r="";
		for(int i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
				r=r +  Character.toUpperCase(name.charAt(i));
			}
			else
			{
				r=r+name.charAt(i);
			}
		}
		System.out.println(r);

	}

}
