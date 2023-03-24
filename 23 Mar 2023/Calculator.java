class Calculation //creating a class
{
	int a=35, b=10;
	void add() // create a add method
	{
		System.out.println("Addition is:"+(a+b));
	}	
	void sub() // create a sub method
	{
		System.out.println("Subtraction is:"+(a-b));
	}	
	void mul() //create a mul method
	{
		System.out.println("Multiplication is:"+(a*b));
	}	
	void div() // create a div method
	{
		System.out.println("Division is:"+(a/b));
	}	
}

class Calculator // main class
{
		public static void main(String args[])
		{
			Calculation a=new Calculation(); //create object of calculation class
			a.add(); //call add method
			a.sub(); //call sub method
			a.mul(); //call mul method
			a.div(); //call div method
		}
}		