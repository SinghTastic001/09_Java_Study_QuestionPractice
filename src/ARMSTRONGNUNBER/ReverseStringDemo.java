package ARMSTRONGNUNBER;

public class ReverseStringDemo {
	
	public static void main(String[] args) {
		
		String name = "shubhi";
		String new_n = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			new_n = new_n + name.charAt(i);
			
		}
		System.out.println(new_n);
	}

}
