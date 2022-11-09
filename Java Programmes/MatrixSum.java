// program to find  sum of two matrix

class MatrixSum
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int sum[][] = new int[10][10];
		System.out.println("Sum of matrix a and matrix b is ");
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum[i][j] = a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
				System.out.println();
		}
		
	}
}