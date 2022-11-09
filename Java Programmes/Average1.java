// program to find the average of 3 nos using method overloding (Instance method).

class Average1 
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
			Average obj = new Average();
		
			System.out.println(obj.average(10,20,30));
			System.out.println(obj.average(10.5f,20.5f,30.5f));
		}
  
}


	