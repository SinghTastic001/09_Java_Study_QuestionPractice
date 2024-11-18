package ReverseNumber3W;

import java.util.Scanner;

public class StringBufferUse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println(rev);
	}
}
