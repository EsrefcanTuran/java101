import java.util.Scanner;

public class PrimeNumbersBetween1To100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Prime numbers between 1 to 100 are:");
		int count;
		for (int i = 2; i <= 100; i++) {
			count = 0;
			for (int j = 1; j <= i; j++)
				if (i % j == 0)
					count++;
			if (count == 2)
				System.out.print(i +" ");
		}

	}

}
