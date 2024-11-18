package SwapNumber;

public class WithoutUsingThirdV {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 50;
		System.out.println("before swap "+a+" "+b);
//		if(a!=b) {
//			
//			a = a+b;
//			b = a-b;
//			a = a - b;
//			
//			System.out.println("after swap without using third variable using only addition and subtraction"+a+" "+b);
//		}
		
//		if(a!=b) 
//		{
//			a = a*b;
//			b = a/b;
//			a = a/b;
//			System.out.println("after swap without using third variable using only multiplication and division"+a+" "+b+" ");
//		}
		
		
//		if(a!=b) {
//			a=a^b;
//			b = a^b;
//			a = a^b;
//			System.out.println("after swap without using third variable using only XOR "+a+" "+b);
//		}
		
//		single line 
		b = a+b - (a=b);
		System.out.println("single line "+a+" "+b+" ");
	}

}
