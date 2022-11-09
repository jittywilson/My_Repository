// Program to find Factorial of a number using static method

class Factorial
{
	static int factorial(int num)
	{
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of number "+num+" is "+fact);
		return fact;
	}
	public static void main(String args[])
	{
		Factorial.factorial(5);
	}
}