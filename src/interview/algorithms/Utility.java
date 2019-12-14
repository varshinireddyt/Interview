package interview.algorithms;

public class Utility {
	
	private void findUnique(String str) {
		
		int length = str.length();
		for(int i = 0; i < length; i++) {
			for(int j = i + 1; j<length; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					 System.out.println("no unique characters");
					 break;
				}
				 System.out.println(str.charAt(i));
				
			}
		
		}
	}
	
	public static void main(String[] args) {
		
		Utility obj = new Utility();
		obj.findUnique("abc");
	}

}
