package ReverseEachWordInString;

public class RealAnswer {

	public static void main(String[] args) {
		
		String s = "java is the best";
		
//		System.out.println(s.split(" "));
		String[] splitword = s.split(" ");
		

		String new_s = "";
		
		for(String w : splitword) {
			
			for(int i=w.length()-1; i>=0; i--) {
				new_s = new_s + w.charAt(i);
			}
			new_s = new_s + " ";
			
			
		}
		
		System.out.println(new_s);
		
		
	}
}
