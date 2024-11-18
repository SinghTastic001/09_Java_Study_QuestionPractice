package Question;

public class armcheck {
	
	public static void main(String[] args) {
		
		int arm = 8208;
		int temp = arm;
		int ctemp = arm;
		int sum =0;
		int r=0;
		int count =0;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		}
//		System.out.println(count);
		
		while(ctemp>0) {
			
			r=ctemp%10;
			sum = sum+ (int) Math.pow((double) r,(double) count );
			
			ctemp=ctemp/10;
		}
		
		if(sum==arm) {
			System.out.println("arm number");
		
		}else {
			System.out.println("not arm number");
		}
		
	}

}
