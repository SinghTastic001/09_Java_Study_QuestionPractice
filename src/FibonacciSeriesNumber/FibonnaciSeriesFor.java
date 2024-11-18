package FibonacciSeriesNumber;

public class FibonnaciSeriesFor {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = a+b;
		
		System.out.print(a+" "+b+" ");
		for(int i=2; i<10; i++) {
			
			System.out.print(c+" ");
			
			a = b;
			b = c;
			c = a+b;
		}
	}

}
