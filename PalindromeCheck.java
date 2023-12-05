package practice;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		System.out.println(new PalindromeCheck().findpalindrome("1333MADAM331"));
		
	}
	
	boolean findpalindrome(String str) {
		if(str.length()==1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length()-1)) {
			return findpalindrome(str.substring(1,str.length()-1));
		}
		return false;
	}

}
