// program using method overloading

class Sample2
{
	int num1;
	float num2;
	int num3;
	float sum;
	float Calcsum(int a, float b)
	{
		num1=a;
		num2=b;
		sum = a+b;
		return sum;
	}
	float Calcsum(int a,float b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
		sum = a+b+c;
		return sum;
	}
	void display()
	{
		System.out.println("Sum is "+sum);
	}
	public static void main(String args[])
	{
		Sample2 obj = new Sample2();
		obj.Calcsum(10,20.5f);
		obj.display();
		obj.Calcsum(20,30.5f,10);
		obj.display();
	}
}