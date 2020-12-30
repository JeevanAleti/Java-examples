import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
	//You are given a string containing characters  and  only. 
	//Your task is to change it into a string such that there are no matching adjacent characters.
	//To do this, you are allowed to delete zero or more characters in the string.

	//Your task is to find the minimum number of required deletions.

	//For example, given the string , remove an  at positions  and  to make  in  deletions.


    static int alternatingCharacters(String s) {

            int count =0;
            char[] str = s.toCharArray();
                for(int i=0; i<str.length-1; i++){
               
                    if(str[i] == str[i+1]){
                    count++;
                    }
                }
                return count;
                   
    }
    
    
    public static void main(String[] args) 
    { 
      String str = "AAABBB"; 
      // Function call to print answer  
     System.out.println("You have to perform" + " "+alternatingCharacters(str)+" "+ "deletions"); 
    } 
} 

//    private static final Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String s = scanner.nextLine();
//
//            int result = alternatingCharacters(s);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }

