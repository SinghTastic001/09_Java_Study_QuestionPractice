package ARMSTRONGNUNBER;

public class StringReverseDemo {
	
	public static void main(String[] args) {
		
		String name = "shubhi";
		
		String new_name = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			new_name = new_name + name.charAt(i);
			
			
		}
		System.out.println(new_name);
		
	}

}
