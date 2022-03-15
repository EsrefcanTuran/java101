import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int less = 0, greater = 0;
		 int[] list = {15,12,788,1,-1,-778,2,0};
		 System.out.println("Array: "+ Arrays.toString(list));
		 System.out.print("Please provide a number to check: ");
		 int userInput = input.nextInt();
		 Arrays.sort(list);
		 if (userInput <= list[0] || userInput >= list[list.length - 1]) {
	            System.out.println("You provided a number out of range. Please provide a number between "
	            + list[0] + " and " + list[list.length - 1]);}
		 else
			 for (int i = 0; i < list.length; i++)
				 if (userInput >= list[i] && userInput <= list[i+1]) {
					 less = list[i];
					 greater = list[i+1];
					 break;
					 }
		 
		 System.out.println("Lower closest number is: "+ less);
		 System.out.println("Higher closest number is: "+ greater);
	}

}
