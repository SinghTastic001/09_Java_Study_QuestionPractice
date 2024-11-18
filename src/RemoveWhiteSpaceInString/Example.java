package RemoveWhiteSpaceInString;

public class Example {

	public static void main(String[] args) {
		
		String s = "Singh Shubhi How a r you ";
//		String nes = "";
		
		String ss = " S I N G H Shubhi";
//		
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)!= ' ') {
//				nes = nes + s.charAt(i);
//			}
//		}
//		
//		System.out.println(nes);
		
		String news = s.replaceAll("\\s", "");
		String newss = ss.replaceAll("\\s", "");
		System.out.println(news);
		
	}
}
