package MaxAndMinArray;

import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int[] ar = {1,2,4,5,6,7,7,7,8,8,10,2,3};
		
		HashSet<Integer> in = new HashSet<Integer>();
		
		boolean flag = false;
		for(int i : ar) {
			if(in.add(i)==false) {
				System.out.println("duplicate Number is "+i);
				flag = true;
				
			}
		}
		
		if(flag==false) {
			System.out.println("Not found duplicate");
		}
	}
}
