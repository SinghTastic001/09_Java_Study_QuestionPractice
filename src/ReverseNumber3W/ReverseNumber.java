package ReverseNumber3W;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here");
		int num = sc.nextInt();
		String snum = String.valueOf(num) ;
		
		String reversenum = "";
		
		
		for(int i=snum.length()-1; i>=0; i--) {
			
			reversenum = reversenum + snum.charAt(i);
		}
		int result  = Integer.parseInt(reversenum);
		System.out.println(result);
		
		
	}
}
