package GenerateRandomNumber$String;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
//		1st approach to generate number
		
		Random  rand = new Random();
		int store = rand.nextInt(1000);
		System.out.println(store);
		Double store2 = rand.nextDouble();
		System.out.println(store2);
		
		
//		second approach using math class with random method
		
		System.out.println("Math Class using"+Math.random());
		
//		third apache commons-lang API
//		Apache Commons-lang API download it's jar file
		
		
		
	}

}
