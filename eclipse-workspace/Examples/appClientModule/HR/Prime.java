package HR;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Prime {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int n1 = Integer.valueOf(n);
        int count = 0;
        for(int i = 2; i<n1/2; i++){
            if(n1%i == 0){
                count ++;
                break;
            }
        }
        if(count ==0 && n1 !=1){
            System.out.println("prime");
        }
        else {
         System.out.println("not prime");
        }
        
        scanner.close();
    }
}
