import java.util.Scanner;

public class PalindromicNumber {
	
	static boolean isPalindrome(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		
		if (number == reverseNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		n = input.nextInt();
		if (isPalindrome(n))
			System.out.println(n +" is a palindromic number.");
		else
			System.out.println(n +" is not a palindromic number.");

	}

}
