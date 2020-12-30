import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cost {

	public Cost() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	   long t=8;
	    List<Integer> numbers=new ArrayList<Integer>();
	   numbers.add(1);
	   numbers.add(2);
	   numbers.add(3);
	   numbers.add(4);
	   numbers.add(5);
	   
	   long result=triplets(t,numbers);
	   System.out.println(result);
	   
	   
		
		
	}
	
	static long triplets(long t,List<Integer> e)
	{
		Collections.sort(e);
		long count=0;
		for(long i=0;i<e.size();i++)
		{
			for(long j=i+1;j<e.size();j++)
			{
				long target=t-e.get((int) i)-e.get((int) j);
				if(target<0)
					break;
				long k=bin_search(e,target,j+1);
				if(k<e.size() && e.get((int) k)<=target)
				{
					count+=(k-j);
				}
				else if (k<=e.size())
				{
					count+=(k-j-1);
				}
			}
		}
		return count-1;
	}
	
	public static long bin_search(List<Integer> arr,long target,long start) {
		long left=start;
		long right=arr.size()-1;
		while(left<arr.size() && right>=start && left<=right)
		{
			int mid=(int)(left+right)/2;
			if(arr.get(mid)==target)
					return mid;
				else if(arr.get(mid)>target)
					right=mid-1;
				else
				left=mid+1;
		}
		return left;
	}
	
}
