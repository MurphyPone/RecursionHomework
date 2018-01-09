
public class RecursionTester {
	public static void main(String[] args) {
		int testNum = 4;
		int bigNum = 55555;
		
		System.out.println(testNum +"! = " + factorial(testNum));
		System.out.println(testNum +"st/nd/rd/th digit of the fibonacci sequence = " + fib(testNum));
		System.out.println("Sum of the digits of " + bigNum +  " = " + fib(bigNum));

	}
	
	//factorial
	private static int factorial(int n ) {
		if(n <= 1) 
			return 1;	//base case
		else 
			return n * factorial(n-1);
	}
	
	//Fibonacci Sequence
	private static int fib(int n) {
		if (n < 2) //base case 
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
	//DescAsc

}
