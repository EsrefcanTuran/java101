import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		long n, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = input.nextLong();
		
		for (int i = 1; i <= n/2; i++)
			if (n % i == 0)
				sum = sum + i; 
		
		if (sum == n)
			System.out.println(n+" is a perfect number.");
		else
			System.out.println(n+" is not a perfect number.");   

	}

}
