package SwapNumber;

public class UsingThirdVariable {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 40;
		int c ;
		System.out.println("before swap : "+a+" "+b);
		if(a!=b) {
			c = b;
			b = a;
			a = c;
			
			System.out.println("after swap:"+a+" "+b+" ");
		}
	}

}
