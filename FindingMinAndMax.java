import java.util.Scanner;

public class FindingMinAndMax {

	public static void main(String[] args) {
		int min = 0, max = 0, n, temp;
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers would you like to enter?: ");
		n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Number "+ i +": ");
			temp = input.nextInt();
			if (i == 1) {
				min = temp;
				max = temp;
			}
			if (temp < min)
				min = temp;
			if (temp > max)
				max = temp;	
		}
		System.out.print("Max: "+ max +"\nMin: "+ min);

	}

}
