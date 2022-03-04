import java.util.Scanner;

public class PrimeNumberRecursive {
	
	static boolean isPrime(int i, int a) {
		if (a <= 2)
			return (a == 2) ? true : false;
		if (a % i == 0)
			return false;
		if (i * i > a)
			return true;
		
		return isPrime(i+1, a);
	}

	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		a = input.nextInt();
		if (isPrime(2, a))
			System.out.println(a +" is a prime number.");
		else
			System.out.println(a +" is not a prime number.");

	}

}
