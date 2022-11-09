// program using static method

class Sample
{
	int id;// instance variable
	static int age; // static variable

	static void display()
	{
		
		String name;//local variable
		System.out.println("Static method");
		
	}
	void test()
	{
		System.out.println("Instance method");
	}
	public static void main(String args[])
	{
		Sample.display();
		Sample obj = new Sample();
		obj.test();
	}
}