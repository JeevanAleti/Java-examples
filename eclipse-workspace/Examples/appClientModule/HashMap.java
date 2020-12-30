import java.util.*;  
public class HashMap{  
 public static void main(String args[]){  
	 
	 //TreeSet follows ascending order
	 //HashSet doesnt maintain any order
	 //LinkedHashSet follows LinkedList implementation and follows insertion order
   LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");  
      hm.put(134,"Reddy");
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();  
      map.put(104,"Ravi");  
      map.putAll(hm);  
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
 }  
}  