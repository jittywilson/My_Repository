// shifting two values using temporary variables

class Shifting
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Value in a is"+a);
		System.out.println("Value in b is"+b);
		temp = a;
		a=b;
		b= temp;
		System.out.println("Values after shifting");
		System.out.println("Value in a is"+a);
		System.out.println("Value in b is"+b);
	}
}
		
		
		