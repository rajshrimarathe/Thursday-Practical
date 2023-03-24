class Calculation
{
	int a=35, b=10;
	void add()
	{
		System.out.println("Addition is:"+(a+b));
	}	
	void sub()
	{
		System.out.println("Subtraction is:"+(a-b));
	}	
	void mul()
	{
		System.out.println("Multiplication is:"+(a*b));
	}	
	void div()
	{
		System.out.println("Division is:"+(a/b));
	}	
}

class Calculator
{
		public static void main(String args[])
		{
			Calculation a=new Calculation();
			a.add();
			a.sub();
			a.mul();
			a.div();
		}
}		