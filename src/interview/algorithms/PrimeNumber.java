package interview.algorithms;

public class PrimeNumber {
	
	// quotient = 1 and rem = 0
	private void printPrime(int numbers) {
		
		for(int i = 2; i <= numbers; i++) {
			findPrime(i);
		}
	}
	private void findPrime(int number) {
		for(int i=2; i*i <= number; i++) { //sieve of eratosthenes algorithm
//			System.out.print(i);
			int remainder = number % i;
			
			if(remainder == 0) {
				System.out.println(number + "is not a prime number");
				return;
			}
			
		}
		
		System.out.println(number + " ");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber num = new PrimeNumber();
		num.findPrime(53);
		//num.printPrime(200);
	}

}
