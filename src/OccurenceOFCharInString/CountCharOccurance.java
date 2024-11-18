package OccurenceOFCharInString;

public class CountCharOccurance {
	
	public static void main(String[] args) {
		
		String s = " Java is the best programming language";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)== 'm') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
