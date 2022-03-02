import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		double n, i;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = input.nextDouble();
		for (i = 1 ; i <= n; i++)
			sum = sum + (1 / i);
		System.out.println("Harmonic value= "+ sum);

	}

}
