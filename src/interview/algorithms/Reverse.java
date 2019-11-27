package interview.algorithms;
import java.util.*;

public class Reverse {
	
	public String doStringReverse(String name) {
		int length = name.length();
		String reverse = "";
		for(int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);	
		}
		return reverse;
	}
	
//	public String doLetterCount(String name) {
//		String string = "";
//		
//		for(int i = 0; i < name.length(); i++) {
//			int count = 1;
//			
//			for(int j=i; j < name.length(); j++) {
//				if((j+1 < name.length()) && (name.charAt(j) == name.charAt(j + 1))) {	
//					count++;
//				}
//			}
//			
//			string = string + name.charAt(i) + count;
//			//System.out.println(string);
//			
//			
//		}
//		return string;
//		
//	}
	
	
	public void doLetter(String str) {
        int n = str.length(); 
        for (int i = 0; i < n; i++) { 
//        	System.out.print("print called"); 
            // Count occurrences of current character 
            int count = 1; 
            while (i < n - 1 &&  
                   str.charAt(i) == str.charAt(i + 1)) { 
            	
                count++; 
                i++; 
//                System.out.print(i); 
            } 
            System.out.print(i); 
            // Print character and its count 
//           System.out.print(str.charAt(i)); 
//          System.out.print(count); 
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse word = new Reverse();
		//System.out.println(word.doStringReverse("reverse"));
//		word.doLetterCount("aaabba");
		word.doLetter("ababbb");
		
	}

}
