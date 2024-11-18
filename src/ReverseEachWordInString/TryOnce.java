package ReverseEachWordInString;

public class TryOnce {
	
	public static void main(String[] args) {
		
		String s = " java is the best programming language";
		
		String[] array = s.split(" ");
		String  new_s = "";
		
		for(String w : array) {
			
			for(int i=w.length()-1; i>=0; i--) {
				
				new_s = new_s + w.charAt(i);
			}
			new_s = new_s + " ";
		}
		
		System.out.println(new_s);
		
	}

}
