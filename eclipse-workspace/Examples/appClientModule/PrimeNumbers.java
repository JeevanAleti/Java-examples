import java.util.Scanner;

// Java Program to Print Prime Numbers from 1 to N
/*public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int i, number, count; 
		
		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(number = 1; number <= 100; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0)
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}

}

*/

public class PrimeNumbers
{
	private static long startTime = System.currentTimeMillis();


    public static void main(String args[])
    {
        int num, i, count=0;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
//        String s1, strUpper ="Jeevan";
//        s1 = strUpper.toLowerCase();
//        System.out.print("Equivalent Word/Name in Lowercase : " + s1);
//		
        for(i=2; i<=num/2; i++)
        {
            if(num%i == 0)
            {
                count++;
                //break;
            }
        }
        if(count == 0)
        {
            System.out.println("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nIt took " + (endTime - startTime) + " milliseconds");
    }
    
}
