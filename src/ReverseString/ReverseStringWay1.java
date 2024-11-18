package ReverseString;

import java.util.Scanner;

public class ReverseStringWay1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String string = sc.nextLine();
		String rev = "";
		
		if(string!=null) {
			for(int i=string.length()-1; i>=0; i--) {
				rev = rev+string.charAt(i);
			}
			
			System.out.println(rev);
		}
		
	}
}
