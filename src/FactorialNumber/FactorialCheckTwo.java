package FactorialNumber;

public class FactorialCheckTwo {
	
	public static void main(String[] args) {
		
		int num = 13;
		int factorial = 1;
		
		for(int i = 1; i<=num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
