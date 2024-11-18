package EvenAndOddArrayPrint;

public class EvenOddPrint {

public static void main(String[] args) {
		
		int[] array = {1,2,4,5,6,7,11,34,45};
//		int[] even = {};
//		int[] odd = {};
		
		for(int i = 0; i<array.length; i++) {
			
			if(array[i]%2==0) {
				System.out.println("even array print "+array[i]);
			}
		}
		
		for(int i= 0; i<array.length; i++) {
			if(array[i]%2!=0) {
				System.out.println("odd array print"+" "+array[i]);
			}
		}
	}

}
