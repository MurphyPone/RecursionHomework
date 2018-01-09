
public class RecursionTester {
	public static void main(String[] args) {
		int testNum = 5;
		int bigNum = 55055;
		
		System.out.println(testNum +"! = " + factorial(testNum));
		System.out.println(testNum + "th digit of the Fibonacci sequence = " + fib(testNum));
		System.out.println("Sum of the digits of " + bigNum +  " = " + sumOfDigits(bigNum));
		System.out.println("# of 5s in " + bigNum +  " = " + count5s(bigNum));

		System.out.printf("Printing the digits from %d down to 0 and then back up\n", testNum);
		descAsc(testNum);
	}
	
	//Asked Patrick for the prompts 
	
	//factorial
	private static int factorial(int n ) {
		if(n <= 1) 
			return 1;	//base case
		else 
			return n * factorial(n-1);
	}
	
	//Fibonacci Sequence
	private static int fib(int n) {
		if(n < 2)	//Base case
			return n;
		else 
			return fib(n-1) + fib(n-2);	//Googled expression : X(n) = X(n-1) + X(n-2)...
	}
	
	//sum of digits
	private static int sumOfDigits(int n) {
		if(n < 10) //base case (single digit)
			return n;
		else 
			return (n % 10) + sumOfDigits(n/10);	//Add last digit, remove last digit, recurse 
	}
	
	//count5s
	private static int count5s(int n) {
		if(n < 10)	//Base cases
			if(n == 5)	
				return 1;
			else 
				return 0;
		if(n % 10 == 5)	//Had to google this, I wasn't using modulo, the rest of my code was pretty much the same 
			return 1 + count5s(n/10);	
		else 
			return count5s(n/10);
	}
	
	//DescAsc
	private static void descAsc(int n) {
		if(n == 0) 
			System.out.println(n);
		else {
			System.out.println(n);
			descAsc(n-1);
			System.out.println(n);
		}
	}

}
