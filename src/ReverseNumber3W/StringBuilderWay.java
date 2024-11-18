package ReverseNumber3W;

import java.util.Scanner;

public class StringBuilderWay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		StringBuilder rev ;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		rev = sb.reverse();
		System.out.println(rev);
	}
}
