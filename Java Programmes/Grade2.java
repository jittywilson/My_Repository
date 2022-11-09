// Program to find grade of two students by finding the total marks using construction overloading.

class Grade2
{
	int mark1;
	int mark2;
	int mark3;
	String student1 ="Anu";
	String student2;
	Grade2(int a, int b, int c)
	{
		mark1=a;
		mark2=b;
		mark3=c;
	}	
	Grade2(int a, int b, int c, String n)
		{
			mark1=a;
			mark2=b;
			mark3=c;
			student2=n;
		}
		void evaluvate1()
		{
			int sum=mark1+mark2+mark3;
			if(sum>=80)
			{
				System.out.println("Grade of Student "+student1+" is A Grade");
			}
			else if(sum<=80||sum>=60)
			{
				System.out.println("Grade of Student "+student1+" is B Grade");
			}
			else
			{
				System.out.println("Grade of Student "+student1+" is C Grade");
			}
		}
		void evaluvate2()
		{
			int sum=mark1+mark2+mark3;
			if(sum>=80)
			{
				System.out.println("Grade of Student "+student2+" is A Grade");
			}
			else if(sum<=80 && sum>=60)
			{
				System.out.println("Grade of Student "+student2+" is B Grade");
			}
			else
			{
				System.out.println("Grade of Student "+student2+" is C Grade");
			}
		}
		
		public static void main(String args[])
		{
			Grade2 obj1 = new Grade2(60,20,10);
			Grade2 obj2 = new Grade2(10,10,5,"Manu");
			obj1.evaluvate1();
			obj2.evaluvate2();
		}
}