package PalindromCheck;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int num = 12321;
		int temp =  num;
		int rev = 0;
		
		while(temp>0) {
			
			rev = rev*10 + temp%10;
			temp = temp/10;
//			System.out.println(rev);
		}
		
//		System.out.println(rev);
//		System.out.println(num);
		
		if(rev==num) {
			System.out.println("palindrome number this is");
		}else {
			System.out.println("Not palindrome number");
		}
	}

}
