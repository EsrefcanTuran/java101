import java.util.Scanner;

public class PlaneTicket {

	public static void main(String[] args) {
		int km, age, type;
		double perkm = 0.1, total;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the distance: ");
		km = input.nextInt();
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		System.out.print("Please enter the flight type (1 => One Way, 2 => Round Trip): ");
		type = input.nextInt();
		
		total = km * perkm;
		
		if (age < 0 || km < 0 || type < 1 || type > 2)
			System.out.println("Wrong input!");
		else if (age < 12)
			total = total - total * 0.5;
		else if (age <= 24 && age >= 12)
			total = total - total * 0.1;
		else if (age > 65)
			total = total - total * 0.3;
		
		if (type == 2) {
			total = 2 * (total - total * 0.2);
			System.out.println("Price= "+ total +" TL");
		} else if (type == 1)
			System.out.println("Price= "+ total +" TL");
			

	}

}
