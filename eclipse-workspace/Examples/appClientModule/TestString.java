import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TestString{  
	
public static long main(List<Integer> cars, int k){ 
//	String s2= new String("jeevan");
//	String s3= s2.intern();
//   String s1="abcd";  
//    
//     
//    
//   System.out.println(s1==s3);  
//   System.out.println(s2.length());
//   System.out.println(s1.substring(1)+ " " +s1.substring(0,1));
//   System.out.println(s1.substring(3)+" "+ s1.substring(0,3));
//    
//	ArrayList<Long> c = new ArrayList<Long>(Arrays.asList(2l, 10l, 8l, 17l));
//	c.add(2L);
//	c.add(10L);
//	c.add(8L);
//	c.add(17L);
	
	cars = Arrays.asList(2, 10, 8, 17);
	k=3;
	Collections.sort(cars);
	long minDis = Long.MAX_VALUE;
	long dist =0;
	for(int i =0; i<cars.size()-k+1; i++) {
		dist = Math.abs((cars.get(i) - cars.get(i+k-1))) +1;
		if(dist<minDis)
			minDis = dist;
	}
	return minDis;
	
 } 
		
		public static void main(String args[]) {
			System.out.println("hello");	
			
		}

}  

