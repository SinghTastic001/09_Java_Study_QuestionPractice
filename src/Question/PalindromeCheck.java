package Question;

public class PalindromeCheck {
	
	public static void main(String[] arg) {
		
		String  name = "noon";
		String name1 =  "";
		
		for(int i= name.length()-1; i>=0; i--) {
			
			name1 = name1 + name.charAt(i);
		}
		System.out.println(name1);
		if(name.equals(name1)) {
			System.out.println("it is palidrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
