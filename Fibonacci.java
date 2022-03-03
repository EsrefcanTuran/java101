import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, total;
		Scanner input = new Scanner(System.in);
		System.out.print("How many fibonacci numbers do you want to see?: ");
		total = input.nextInt();
		
		for (int i = 1; i <= total; i++) {
			System.out.print(n1 +" ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

	}

}
