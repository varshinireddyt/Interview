package interview.algorithms;

public class Palindrome {
	
	
		//by comparing string characters
		private void findPalindrome(String str) {
			int length = str.length();
			
			for(int i = 0; i < length; i++) {
				if(str.charAt(i) != str.charAt(length-1-i)) {
					System.out.println(str + " is not palindrome");
					return;
				}				
			}
			System.out.println(str + " is a palindrome");			
		}
		
		//by comparing two strings
		private void doPalindrome(String str) {
			int length = str.length();
			String reverse = "";
			for(int i = length - 1; i >= 0; i--) {
				reverse = reverse + str.charAt(i);	
			}
			
			if(reverse.equals(str)) {
				System.out.print(str + " is a palindrome");
			} else {
				System.out.print(str + " is not palindrome");
			}
		}
		
	public static void main(String[] args) {
		
		Palindrome string = new Palindrome();
		string.findPalindrome("tomato");
		string.doPalindrome("LOL");
	}

}
