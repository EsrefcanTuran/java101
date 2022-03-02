import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int base = input.nextInt();
		int total = 1;
		System.out.print("Enter the exponent number: ");
		int exp = input.nextInt();
		
		for (int i = 1; i <= exp; i++)
			total *= base;
		
		System.out.println("Result of "+ base +" power "+ exp +" is "+ total);

	}

}
