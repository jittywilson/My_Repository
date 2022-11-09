// shifting two values without using temporary variables

class Shift
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		System.out.println("Value in a is "+a);
		System.out.println("Value in b is "+b);
		System.out.println("Values after shifting");
		a=a+b; // value of a = 30, b=20
		b=a-b; // value of b = 10, a=30
		a=b-a; // value of a = 20, b=10
		System.out.println("Value in a is "+a);
		System.out.println("Value in b is "+b);
	}
}
		
		
		