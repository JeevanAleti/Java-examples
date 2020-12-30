package HR;

import java.util.*;

public class Multi {



    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
    	System.out.print("Enter a number: ");
    	int N = scanner.nextInt();
    	
        for(int i=1; i<=10; i++)
        {
        System.out.println(N +"*" + i + "=" + N*i);
        }
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        
        
    }
}