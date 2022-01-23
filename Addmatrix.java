
public class Addmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{3,2,1},{4,3,5}};
int b[][]= {{4,5,6},{7,8,6},{6,4,2}};
int c[][]=new int[3][3];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+"  ");
	}
	System.out.println();
	}
	}

}
