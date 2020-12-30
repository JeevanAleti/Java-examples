package HR;

import java.io.*;
import java.util.*;

public class Regex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       
        //String s2 = s.replace("  ", " ");
        //s = s.trim();
        //if(s == null || s.equals("") || s.trim().equals("")) {
        //    System.out.println("0");
        //}
        if (s == null || s.trim().equals(""))
        {
        	System.out.println("0"); 
        } 
         
        //String delims = "[ !,?._'@]+";
        String[] s1 = s.trim().split("[ !,?\\._'@]+");  
           System.out.println(s1.length);
       
        for(String a : s1)
        System.out.println(a);
        
        scan.close();
    }
}

