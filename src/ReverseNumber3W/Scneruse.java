package ReverseNumber3W;

import java.util.Scanner;

public class Scneruse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		String stnum = String.valueOf(num);
		String sblank = "";
		
		for(int i=stnum.length()-1; i>=0; i--) {
			sblank = sblank+stnum.charAt(i);
		}
		int rs  = Integer.parseInt(sblank);
		System.out.println(rs);
	}
	
}
