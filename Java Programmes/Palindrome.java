// Program to find Palindrom using Static Method

class Palindrome
{
	static int rev=0;
	static int rem=0;
	static int num;
	static int palindrome(int n)
	{
		num=n;
		System.out.println("The number is "+num);
		do
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}while(num>0);
			System.out.println("The reverse of the number is "+rev);
			
			if(rev==n)
			{
			System.out.println("The number is a palindrome number");
			return rev;
			}
			else
			{
			System.out.println("The number is not a palindrome number");
			return rev;
			}
	}
	public static void main(String args[])
	{
		Palindrome.palindrome(123);
		
	}
}