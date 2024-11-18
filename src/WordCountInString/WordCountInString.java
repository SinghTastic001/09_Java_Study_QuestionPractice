package WordCountInString;
import java.util.Scanner;

public class WordCountInString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String here ");
		
		String s = sc.nextLine();
		String[] array = s.split(" ");
		int count = 0;
		for(String s1 : array)
			count++;
		
		System.out.println(count);
	}

}
