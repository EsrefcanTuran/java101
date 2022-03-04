import java.util.Scanner;

public class PowerOfNumberRecursive {
	
	static int power(int base, int exp) {
		if (exp == 0)
			return 1;
		else
			return base * power(base, exp-1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int base = input.nextInt();
		System.out.print("Enter the exponent number: ");
		int exp = input.nextInt();
		
		System.out.println("Result of "+ base +" to the power "+ exp +" is "+ power(base, exp));

	}

}
