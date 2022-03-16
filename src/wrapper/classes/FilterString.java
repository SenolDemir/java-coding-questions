package wrapper.classes;

public class FilterString {

	/**
		Write a method that filters a given string and return only alphabetic characters as string.
	 */

	public static void main(String[] args) {


		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		System.out.println(filterString(str));
		
		
	}
	
	public static String filterString (String s) {
		
		String str1="";
		for (int i=0; i<s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' ') {
				str1=str1+s.charAt(i);
			}
		}
		
		
		return str1;
	}
	
	

}
