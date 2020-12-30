/**
 * 
 */
package com.ibm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nulak
 *
 */
public class ClosestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		String s = "hackerrank";
		list.add(4);
		list.add(1);
		list.add(6);
		list.add(8);
		System.out.println(closest(s,list));
	}
	public static List<Integer> closest(String s,List<Integer> list) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		Map<Character,List<Integer>> map = new HashMap<>();
		for (int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))==null) {
				List<Integer> charlist = new ArrayList<Integer>();
				charlist.add(i);
				map.put(s.charAt(i), charlist);
			} else {
				List<Integer> charlist = map.get(s.charAt(i));
				charlist.add(i);
				map.put(s.charAt(i), charlist);
			}
		} 
		System.out.println(map);
	/*	for (Integer j :list) {
		//	int minLeng = Integer.MIN_VALUE;
			System.out.println("inside first for loop j value :"+j);
			List<Integer> l = map.get(s.charAt(j));
			System.out.println(l);
			if(l.size()==1) {
				list1.add(-1);
			} else {
				for (int k=0;k<l.size();k++) {
					
					if(l.get(k)==j) {
						System.out.println(k+"  "+ j +"k+1:"+(k+1)+ "  k-1:"+(k-1));
						if(k-1<0) {
							list1.add(l.get(k+1));
							
						} else
						if (k+1>=l.size()) {
							list1.add(l.get(k-1));
							
						}else
						if(l.get(k+1)-j < j- l.get(k-1)) {
							list1.add(l.get(k+1));
						}else {
							list1.add(l.get(k-1));
						}
						break;
					}
				}
			}
			
		}*/
		
		for (Integer j :list) {
			int minlength = Integer.MIN_VALUE;
			int count =0;
			char c = s.charAt(j);
			for (int i=j+1,k=j-1;i<s.length()||k>=0;i++,k--) {
			
				if(i<s.length()&&c==s.charAt(i)) {
					if(minlength<i) {
						minlength = i;
					}
				}
				
				if (k>=0&& c==s.charAt(k)) {
					if(minlength<k) {
						minlength = k;
					}
				}
				if (minlength>Integer.MIN_VALUE) {
					list1.add(minlength);
					count=count+1;
					break;
				}
			}
			if (count>0) {
				list1.add(-1);
			}
			
		} 
		
		return list1;
	}

}
