// program to sort an array

class ArraySort
{
	public static void main(String args[])
	{
		int a[] = {8,2,9,6,1};
		int temp =0;
		System.out.println("Elements before sorting ");
			for(int i =0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
				
			}
		
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					
					}
				}
			}
			System.out.println();
			System.out.println("Elements after sorting ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
	}
}
		