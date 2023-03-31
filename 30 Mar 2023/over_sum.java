//overloading in java
class over_sum
{
	public int sum(int x, int y)
	{
		return(x+y);
	}
	public int sum(int x, int y, int z)
	{
		return(x+y+z);
	}

		public static void main(String args[])
		{
			over_sum s = new over_sum();
			System.out.println(s.sum(20,40));
			System.out.println(s.sum(10,20,5));
		}
}		
			