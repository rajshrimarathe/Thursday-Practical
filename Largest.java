public class Largest {

    public static void main(String[] args) {

        int n1 = 15, n2 = 32, n3 = 24;

        if( n1 > n2 && n1 > n3)
		{
            System.out.println("Number 1 is the largest number.");
		}	

        else if (n2 > n1 && n2 > n3)
		{
            System.out.println("Number 2 is the largest number.");
		}	

        else if(n3>n1 && n3>n2)
		{
            System.out.println("Number 3 is the largest number.");
		}
		else
		{
				System.out.println("All are equal");
		}		
    }
}