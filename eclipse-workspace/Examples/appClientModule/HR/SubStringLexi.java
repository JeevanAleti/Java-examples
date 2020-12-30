package HR;

import java.util.Scanner;

public class SubStringLexi{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        //take String = Jeevan
        
        smallest =largest = s.substring(0,k); //Jee
        for(int i =1; i < s.length()-k+1; i++)
        {//first i=1, i<4 //i=2, smallest = eev
            String substr = s.substring(i, i+k);//substr=eev //for i =2, subst=eva
            if(smallest.compareTo(substr) > 0){//Jee.compareTo(eev)>0, true,
            //eev.compareTo(eva), false
                smallest = substr;//hence smallest = eev
            }
            if(largest.compareTo(substr) < 0){//for i =2, Jee.compareTo(eva)<0 false
                largest = substr;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.next();
	    int k = scan.nextInt();
	    scan.close();
	  
	    System.out.println(getSmallestAndLargest(s, k));
	}
}