// program using this keyword

class ReverseTest
{
	int num;
	int rem =0;
	int rev =0;
	ReverseTest()
	{
		this(123);
		System.out.println("Default constructor invoked");
		System.out.println("Reversed Number is "+rev);
	}
	ReverseTest(int num)
	{
		System.out.println("The number to be reversed  "+num);
		
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
	}
}