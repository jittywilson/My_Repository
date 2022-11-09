// program to find  difference of two matrix

class MatrixDiff
{
	public static void main(String args[])
	{
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int b[][] = {{90,80,70},{60,50,40},{30,20,10}};
		int sum[][] = new int[10][10];
		System.out.println("Difference of matrix a and matrix b is ");
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum[i][j] = a[i][j]-b[i][j];
				System.out.print(sum[i][j]+" ");
			}
				System.out.println();
		}
		
	}
}