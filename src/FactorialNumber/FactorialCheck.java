package FactorialNumber;

public class FactorialCheck {
	
	public static void main(String[] args) {
		
		long num = 15;
		long totalNum = 1;
		
		for(int i = 15; i>0; i--) {
			totalNum = totalNum * i;
			
		}
		System.out.println(totalNum);
	}

}
