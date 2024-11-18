package Question;

public class TwoNumSwapThirdVariable {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 50;
		int c;
		System.out.println("beffore"+a+" "+b+" ");
		if(a!=b) {
			
			c=b;
			b=a;
			a=c;
		}
		
		System.out.println("after"+a+" "+b+" ");
	}

}
