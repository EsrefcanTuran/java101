import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		int i, j, r;
		System.out.print("Please enter the height of the reverse triangle: ");
		Scanner input = new Scanner(System.in);
		r = input.nextInt();
		
		for (i = r; i >= 1; i--) {
			for (j = 1; j <= r-i; j++)
				System.out.print(" ");
			for (j = 1; j <= 2*i-1; j++)
				System.out.print("*");
			System.out.print("\n");
		}

	}

}
