package Question;

public class SwapNumNoThirdariable {

//	not third variable
	
	public static void main(String[] args) {
		
		int a=20;
		int b=50;
		
//		if(a!=b) {
//			a = a+b;
//			b = a-b;
//			a = a-b;
//			
//			
//		}
		
		if(a!=b) {
			
			a = a*b;
			b = a/b;
			a = a/b;
		}
		
		System.out.println("after"+a+" "+b+" ");
	}
}
