// program to find the sum of 3 nos. using constructor.

class Sum3 
{
	int firstNo;
	int secondNo;
	int thirdNo;
	Sum3(int a, int b, int c)
	{
		firstNo = a;
		secondNo = b;
		thirdNo = c;
		int sum = a+b+c;
		System.out.println("Sum of three numbers is "+sum);
	}
	public static void main(String args[])
	{
		Sum3 obj = new Sum3(10,20,30);
	}
}
	
		