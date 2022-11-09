// Program to find the largest among three numbers

class LargestNum
{
	public static void main(String args[])
	{
		int num1 = 500;
		int num2 = 1500;
		int num3 = 3;
		if(num1>num2 && num1>num3)
		{
			System.out.println("Number "+num1+" is the largest number");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("Number "+num2+" is the largest number");
		}
		else
		{
			System.out.println("Number "+num3+" is the largest number");
		}
	}
}
		