import java.util.Scanner;

public class FibonacciRecursive {
	
	static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Which fibonacci number do you want to see?: ");
		n = input.nextInt();
		System.out.println(n +". fibonacci number is: "+ fib(n));

	}

}
