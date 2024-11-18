package MaxAndMinArray;

import java.util.HashSet;

public class DuplicateFindUsingHastSet {
	
	public static void main(String[] args) {
		
		String[] ar = {"java","C+","python","js","java"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(String s : ar) {
			
			if(set.add(s)==false) {
				System.out.println("duplicate value is "+s);
			}
		}
	}

}
