import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();
		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();
		
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.print("Your choice: ");
		select = input.nextInt();
		
		switch (select) {
			case 1:
				System.out.println("Addition: " + (n1 + n2));
				break;
			case 2:
				System.out.println("Subtraction: " + (n1 - n2));
				break;
			case 3:
				System.out.println("Multiplication: " + (n1 * n2));
				break;
			case 4:
				if (n2 != 0)
					System.out.println("Division: " + (n1 / n2));
				else
					System.out.println("A number cannot be divided by zero!");
				break;
			default:
				System.out.println("You entered a wrong number, try again!");
		}

	}

}
