// program to find the area of square, rectangle, circle using method overloding (Instance (Non-Static) method).

class Areas2 
{
		static int areaSquare (int side)
		{	
			int area = side*side;
			
			System.out.println("Area of Square "+area);
			return area;
		}
		static float areaRectangle(float length, float bredth)
		{
			float area = length*bredth;
			
			System.out.println("Area of Rectangle "+area);
			return area;
		}
		static float areaCircle(float side)
		{
			float pie = 3.14f;
			float area = pie*side*side;
			
			System.out.println("Area of Circle "+area);
			return area;
		}
		public static void main(String args[])
		{
			Areas2 ob1 = new Areas2();
			Areas2 ob2 = new Areas2();
			Areas2 ob3 = new Areas2();
			ob1.areaSquare(10);
			ob2.areaRectangle(10,20.5f);
			ob3.areaCircle(10);
		}
}
		