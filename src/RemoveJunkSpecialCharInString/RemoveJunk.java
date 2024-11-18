package RemoveJunkSpecialCharInString;

public abstract class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s = "Hello! This string contains special characters like @#$%^&* and numbers like 12345.";
		String result = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
	}

}
