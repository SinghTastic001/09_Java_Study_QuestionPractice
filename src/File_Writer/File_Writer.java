package File_Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\shubu\\OneDrive\\Desktop\\first1.txt");
		BufferedWriter w = new BufferedWriter(fw);
		
		w.write("hello shubhi singh");
		w.write("\nare youuuu here ");
		w.write("\nAll the best");
		
		w.close();
		
		FileReader file = new FileReader("C:\\Users\\shubu\\OneDrive\\Desktop\\first1.txt");
		BufferedReader br = new BufferedReader(file);
		
		String s ;
		
		while((s = br.readLine())!= null) {
			
			System.out.println(s);
		}
		br.close();
		
		
	}
}
