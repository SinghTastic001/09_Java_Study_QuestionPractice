package RemoveJunkSpecialCharInString;

public class Example {
	
	public static void main(String[] args) {
		
		String s = "!@$%^&*123abcXYZ[]~|_+-=,.;:/?<>{}";
		String result = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
	}

}
