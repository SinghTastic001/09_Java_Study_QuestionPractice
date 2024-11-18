package PalindromCheck;

import java.util.Scanner;

public class PalindromeStringC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string here ");
		String st = sc.nextLine();
		
		
		String rev = "";
		
		for(int i=st.length()-1; i>=0; i--) {
			
			rev = rev +st.charAt(i);
		}
		
//		System.out.println(rev);
		
		if(st.equals(rev)) {
			System.out.println("palindrome string");
		}else {
			System.out.println("Not a palindromem String");
		}
	}

}
