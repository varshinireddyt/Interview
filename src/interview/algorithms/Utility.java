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
	
	private int doFibonacci(int n) {
		
	if( n<=1) {
		return n;
	}
	else {
		
	
	return doFibonacci(n-1) + doFibonacci(n-2);
	}
	}
	
	public static void main(String[] args) {
		
		Utility obj = new Utility();
//		obj.findUnique("abc");
		
		System.out.println(obj.doFibonacci(9));
	}

}
