import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		String userName, password;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your username: ");
		userName = input.nextLine();
		System.out.print("Your password: ");
		password = input.nextLine();
		
		if (userName.equals("patika") && password.equals("java123"))
			System.out.println("Successfully logged in!");
		else {
			if (!userName.equals("patika"))
				System.out.println("Wrong username!");
			if (!password.equals("java123")) {
				System.out.print("Wrong password! Do you want to reset your password? (1: Yes, 2: No)");
				int reset = input.nextInt();
				
				switch (reset) {
					case 1:
						Scanner input2 = new Scanner(System.in);
						System.out.print("Please enter your new password: ");
						String newPassword = input2.nextLine();
						if (newPassword.equals("java123"))
							System.out.println("Your new password can't be the same as your old one!");
						else
							System.out.println("You successfully changed your password!");
						break;
					case 2:
						System.out.println("Please try again!");
						break;
					default:
						System.out.println("Invalid choice!");
				}
			}
		}
		

	}

}
