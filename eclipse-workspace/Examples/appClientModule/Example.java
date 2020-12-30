import java.util.Scanner;

/*public class Example {

	public static void main(String []args) {
		int i, n, count;
		
		for(n=1; n<=100; n++)
		{
			count = 0;
			for(i=2; i<=n/2; i++)
			{
				if(n%i == 0)
				{
					count++;
					break;
				
				}
				
			}
			if(count == 0)
			{
				System.out.print(n +" ");
			}
			
		}
		
	}

}*/


class Example //Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b = 0,c=1, t;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		
		t = sc.nextInt();
		
		for(int i=1; i<=t; i++)
		{
			
			a = b;
			b = c;
			c = a+b;
			
			System.out.print(a + " ");
		}
		
		
				
	}
}
