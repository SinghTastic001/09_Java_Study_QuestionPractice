package LargestThreeNumber;

public class LargestTernary {
	
	public static void main(String[] args) {
		int a = 1000;
		int b = 2000;
		int c = 500;
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest);
	}

}
