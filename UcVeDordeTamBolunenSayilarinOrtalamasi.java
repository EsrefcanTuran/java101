import java.util.Scanner;

public class UcVeDordeTamBolunenSayilarinOrtalamasi {

	public static void main(String[] args) {
		int number, count = 0, sum = 0;
		double avg;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
            if (i %3 == 0 && i %4 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }

        System.out.println("Sum: "+ sum);
        avg = sum / count;
        System.out.println("Average: "+ avg);

	}

}
