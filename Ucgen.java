import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args) {
		int kenar1,kenar2,kenar3;
        double u, alan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Kenar� giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("2. Kenar� giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("3. Kenar� giriniz: ");
        kenar3 = input.nextInt();
        
        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("��genin alan� = " + alan);  

	}

}
