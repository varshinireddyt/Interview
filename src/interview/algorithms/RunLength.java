package interview.algorithms;



public class RunLength {
	
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
//            System.out.print(i); 
            // Print character and its count 
           System.out.print(str.charAt(i)); 
          System.out.print(count); 
        }
	}
	
	public static void main(String[] args) {
		
		RunLength encoding = new RunLength();
		encoding.doLetter("aabbaa");

	}

}
