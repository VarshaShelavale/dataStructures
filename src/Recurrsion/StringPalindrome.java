package Recurrsion;
 
public class StringPalindrome {
	public static boolean palindrome(int i, String s) {
		if(i>s.length()/2 )return true;
		 if(s.charAt(i)!= s.charAt(s.length()-1-i))return false;
		return palindrome(i+1,s);
	}
	public static void main(String[] args) {
		String s = "bye";
		boolean b=palindrome(0,s);
		System.out.println(b);
		
	}
}
