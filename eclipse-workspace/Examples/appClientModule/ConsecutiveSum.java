import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSum {
	
	
	public static void main(String args[]) {
		//List<Integer> list = new ArrayList<Integer>();
		
		List<Integer> list = new ArrayList<Integer>();
		int s = 0;
		list.add(4);
		list.add(1);
		list.add(6);
		list.add(8);
//		int index=0;
//		System.out.println((index++)+"hello");
	}
	public List<Integer> ConsecutiveSum(int s, List<Integer> list) {
		// TODO Auto-generated constructor stub
		int count=0; 
		for(int i=0; i<list.size(); i++) 
		{
			int index=list.get(i);
			for(int j = 0; j<list.size(); j++) {
				
				if(list.get(i) + list.get(j) == s) { 
					count++;
				System.out.println("jeevan"+ index);
				
			
				}
				else
					System.out.print("hello");
			}
	}
		return list;
	}
}
