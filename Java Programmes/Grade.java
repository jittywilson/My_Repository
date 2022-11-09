// Program for finding grade of a student based on the marks

class Grade
{
	public static void main(String args[])
	{
		int mark =  75;
		if(mark<40)
		{
			System.out.println("Student Failed");
		}
		else if(mark>=40 && mark<=60)
		{
			System.out.println("Student Passed with Grade D");
		}
		else if(mark>=60 && mark<=70)
		{
			System.out.println("Student Passed with Grade C");
		}
		else if(mark>=70 && mark<=80)
		{
			System.out.println("Student Passed with Grade B");
		}
		else if(mark>=80 && mark<=100)
		{
			System.out.println("Student Passed with Grade A");
		}
	    else
		{
		  System.out.println("Invaid mark");
		}
	}
}
		
		
		
		
		
	