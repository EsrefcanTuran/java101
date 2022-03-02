import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		System.out.println("C(n,r)");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 'n': ");
        int n = input.nextInt();

        System.out.print("Please enter 'r': ");
        int r = input.nextInt();

        int total1 = 1;
        int total2 = 1;
        
        for (int i = n ; i > (n-r) ; i-- )
            total1 *= i;

        for (int i = r ; i > 0 ; i-- )
            total2 *= i;

        System.out.println(total1 / total2);

	}

}
