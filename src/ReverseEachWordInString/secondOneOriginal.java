package ReverseEachWordInString;

public class secondOneOriginal {
	
	public static void main(String[] args) {
		
		String s = "Java where r youuuu";
		
		String[] array = s.split("\\s");
		
		String new_string = "";
		
		for(String w : array) {
			
			StringBuilder b = new StringBuilder(w);
			b.reverse();
			
			new_string = new_string +b.toString()+" ";
		}
		
		System.out.println(new_string);
	}

}
