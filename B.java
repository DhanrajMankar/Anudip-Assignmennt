
public class B {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,1,1},{2,2,2},{1,1,1}};
		
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j< 3;j++)
			{
				if(i==j) {
				//System.out.println(a[i][j]+a[j][i] );
				 sum=a[i][j]+sum;
				 
				}
			}
		}
		System.out.println(sum);
		

	}
	

}


 