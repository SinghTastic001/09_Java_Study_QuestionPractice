package Question;

public class FirstTenPrimeCheck {
	
	public static void main(String[] args) {
		
			int countPrime = 0;
			int number = 1;
			
			
			while(countPrime<=10) {
				
				int count = 0;
				for(int i=1; i<=number; i++) {
					if(number%i==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(number);
					countPrime++;
				}
				number++;
			}
		
	}

}
