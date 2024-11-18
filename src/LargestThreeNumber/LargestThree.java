package LargestThreeNumber;

public class LargestThree {

	public static void main(String[] args) {
		
		int a = 1000;
		int b = 2000;
		int c = 200;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater "+a);
			}else {
				System.out.println("c is greate "+c);
			}
		}else {
			if(b>c) {
				System.out.println("b is greater "+b);
			}else {
				System.out.println("c is greater "+c);
			}
		}
	}
}
