package RemoveWhiteSpaceInString;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String string = "S H U B H I Singh ";
		
		String new_string = "";
		
		for(int i = 0; i<string.length(); i++) {
			if(string.charAt(i)!= ' ') {
				new_string = new_string + string.charAt(i);
			}
		}
		System.out.println(new_string);
	}

}
