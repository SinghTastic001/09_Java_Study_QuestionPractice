package ReverseString;

import java.util.Scanner;

public class usingArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.nextLine();
		String rev = "";
		
		char[] a = st.toCharArray();
		System.out.println(a);
		for(int i=a.length-1; i>=0; i--) {
			rev= rev+a[i];
		}
		System.out.println(rev);
		
	}
}
