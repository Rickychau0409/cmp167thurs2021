
public class RecursionCh12 {
	public static int sum( int target) {
		if ( target <=0) // base case
			return 0; 
		else 
			return target + sum(target-1);
	}
	public static int fib(int n ) {
		if (n <= 1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		int n = 5;
		int result = sum(n); //11
		System.out.println(result);
		System.out.println(fib(6)); //8
	}
	//Write a recursive method that will calculate the produx 
}
