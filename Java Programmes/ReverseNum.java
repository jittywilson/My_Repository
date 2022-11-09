// program to find the reverse of a number

class ReverseNum
{
	public static void main(String args[])
	{
		int num =987654321;
		int rev=0, rem=0;
		System.out.println("The Number to be reversed is "+num);
		while(num!=0)
		{
			rem = num%10; 		// rem = 123%10=12					rem = 12%10=2				rem = 1%10 = 1
			rev = rev*10+rem;  //rev = 0*10+3=0+3=3					rev = 3*10+2 = 30+2=32		rev = 32*10+1 = 320+1 = 321
			num = num/10; 	  // num = 123/10 = 12					num = 12/10 = 1             num = 1/10 = 0
		}
			System.out.println("Reversed Number = "+rev);
			
		
	}
}