// Program to find the factorial of a number using this keyword.

class FactorialTest
{
	int num;
	FactorialTest()
	{
		this(5);
		//System.out.println("Default Constructor invoked");
	}
	FactorialTest(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of the number "+num+" is "+fact);
	}
	
}