package File_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstWayyyyy {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\shubu\\OneDrive\\Desktop\\secondFile.txt");
		BufferedReader r = new BufferedReader(file);
		
		String s ;
		while((s = r.readLine())!= null) {
			System.out.println(s);
		}
		r.close();
	}
}
