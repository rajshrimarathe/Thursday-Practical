package pack3;
class Rectangle
{
	int length, breadth;
	
	public Rectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}

	void print_area()
	{
		System.out.println(length*breadth);
	}
	void print_perimeter()
	{
		System.out.println(2*(length*breadth));
	}
}
public class const_rect
{
		public static void main(String args[])
		{
			Rectangle r = new Rectangle(3,4);
			r.print_area();
			r.print_perimeter();
		}
}	
