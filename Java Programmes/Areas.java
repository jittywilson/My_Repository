// program to find the area of square, rectangle, circle using method overloding (Static method).

class Areas 
{
		static int areaSquare (int side)
		{	
			int area = side*side;
			return area;
		}
		static float areaRectangle(float length, float bredth)
		{
			float area = length*bredth;
			return area;
		}
		static float areaCircle(float side)
		{
			float pie = 3.14f;
			float area = pie*side*side;
			return area;
		}
		public static void main(String args[])
		{
			System.out.println("Area of Square "+Areas.areaSquare(10));
			System.out.println("Area of Rectangle "+Areas.areaRectangle(10,20.5f));
			System.out.println("Area of Circle "+Areas.areaCircle(10));
		}
}
		