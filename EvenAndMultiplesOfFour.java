import java.util.Scanner;

public class EvenAndMultiplesOfFour {

	public static void main(String[] args) {
		int number, total = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Please enter a number: ");
			number = input.nextInt();
			if (number %4 == 0)
				total += number;
		} while (number %2 == 0);
		
		System.out.println("Sum of multiples of four that you entered is: "+ total);

	}

}
