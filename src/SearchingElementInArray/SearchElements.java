package SearchingElementInArray;

public class SearchElements {
	
	public static void main(String[] args) {
		
		int[] array = {10,20,40,80,50,60};
		int num = 30;
		
		boolean flag = false;
		for(int i=0; i<array.length; i++) {
			if(array[i]==num) {
				System.out.println("Element"+" "+num+ "is present");
				flag = true;
			}
			
		}
		if(flag==false) {
			System.out.println("30 is not present");
		}
	}
	

}
