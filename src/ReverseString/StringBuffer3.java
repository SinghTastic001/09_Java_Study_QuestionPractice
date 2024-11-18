package ReverseString;

import java.util.Scanner;

public class StringBuffer3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inp = sc.nextLine();

        // Create a StringBuffer with the input string
        StringBuffer sb = new StringBuffer(inp);
        StringBuffer rev = sb.reverse();
        System.out.println(rev);
         
    }
}
