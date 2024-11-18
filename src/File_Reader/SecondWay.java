package File_Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondWay {
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		using file and Scanner
		
		File file = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\secondFile.txt");
		Scanner sc = new Scanner(file);
		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		
//		third approach
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
	}

}
