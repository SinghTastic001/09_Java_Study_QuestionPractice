package WordCountInString;

public class ReverseStringWord {
	
	public static void main(String[] args) {
		
		String s = "Welcome to the world";
		String[] array = s.split(" ");
		
		String news = "";
		
		for(String a : array) {
			for(int i=a.length()-1; i>=0; i--) {
				
				news = news + a.charAt(i);
			}
			news = news+" ";
		}
		
		System.out.println(news);
	}

}
