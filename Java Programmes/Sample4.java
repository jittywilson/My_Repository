// Program using construction overloading

class Sample4
{
	int num1;
	float num2;
	float sum;
	Sample4(int a, int b)
	{
		num1=a;
		num2=b;
		sum = a+b;
	}
	Sample4(int a, float b)
	{
		num1=a;
		num2=b;
		sum=a+b;
	}
	void display()
	{
		System.out.println("Sum of two nos. is "+sum);
	}
	public static void main(String args[])
	{
		Sample4 obj1 = new Sample4(10,20);
		Sample4 obj2 = new Sample4(20,10.5f);
		obj1.display();
		obj2.display();
	}
}
		