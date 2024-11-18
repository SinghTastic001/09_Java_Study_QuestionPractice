package PrimeCheck;

public class Second {
	
	public static void main(String[] args) {
		
		int primeCount = 20;
		int count = 0;
		int i = 1;
		
		while(count<=primeCount) {
			
			int j = 1;
			int countDiv = 0;
			while(j<=i) {
				if(i%j==0) {
					countDiv++;
					
				}
				j++;
				
			}
			if(countDiv==2) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

}
