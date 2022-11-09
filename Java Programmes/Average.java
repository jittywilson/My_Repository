// program to find the average of 3 nos.

class Average 
{
		static int average (int a, int b, int c)
		{
			int avg = (a+b+c)/3;
			return avg;
		}
		static float average (float a, float b, float c)
		{
			float avg = (a+b+c)/3;
			return avg;
		}
		public static void main(String args[])
		{
		System.out.println(Average.average(10,20,30));
        System.out.println(Average.average(10.5f,20.5f,30.5f));
		}
  
}


	