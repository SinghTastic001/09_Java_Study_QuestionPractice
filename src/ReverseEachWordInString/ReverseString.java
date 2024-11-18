package ReverseEachWordInString;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "java program";
		String reverse_s = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			reverse_s = reverse_s +s.charAt(i);
		}
		System.out.println(reverse_s);
	}

}
