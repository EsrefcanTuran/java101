import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		double height, weight, bmi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your height in m: ");
	    height = input.nextDouble();
	    System.out.println("Please enter your weight in kg: ");
	    weight = input.nextDouble();
	    
	    bmi = weight / (height * height);
	    System.out.println("Your BMI is: " + bmi);

	}

}
