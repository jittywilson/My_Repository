// program using default constructor and Parametrized constructor

class Sample3
{
	String name;
	Sample3()
	{
		System.out.println("Default Constructor invoked");
	}
	Sample3(String a)
	{
		name=a;
		
	}
	void display()
	{
		System.out.println("My Name is "+name+"(by using paramtrized constructor)");
	}
	public static void main(String args[])
	{
		
		Sample3 obj1 = new Sample3(); // default constructor
		Sample3 obj = new Sample3("Jitty"); // parametrized constructor
		obj.display();
	}
}