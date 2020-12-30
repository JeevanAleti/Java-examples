public class ConcatString
{  
	public static void main(String args[])
	{  
		String s1="java string"; 
		String s2=" is immutable";
		String s= s1.concat(s2);
		s1=s.concat(" for better understanding");  
		System.out.println(s);  

		System.out.println(s1);  
		
		//String s1, strUpper ="Jeevan";
        //s1 = strUpper.toLowerCase();
        //System.out.print("Equivalent Word/Name in Lowercase : " + s1);
	}	
} 