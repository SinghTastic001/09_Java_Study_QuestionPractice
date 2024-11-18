package OccurenceOFCharInString;

public class secondway {

	public static void main(String[] args) {
		
		String s = "java is the best programming lanugage";
		
		int count_string = s.length();
		int new_string = s.replace("j", "").length();
		
		int total_count = count_string - new_string;
		System.out.println(total_count);
	}
}
