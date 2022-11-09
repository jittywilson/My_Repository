// Program to find the fibanocci series

class Fibanocci
{
	public static void main(String args[])
	{
		int firstNum =0;
		int secondNum =1;
		int nextNum;
		int limit = 10;
		System.out.println("Fibanocci Series for "+limit+" terms = ");

		for(int i=1;i<=limit;i++)
		{
				System.out.print(firstNum+" , ");
				nextNum = firstNum+secondNum;
				firstNum = secondNum;
				secondNum = nextNum;
		}
		
		

	}
}