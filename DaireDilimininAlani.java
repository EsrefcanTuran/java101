import java.util.Scanner;

public class DaireDilimininAlani {

	public static void main(String[] args) {
        int r, alpha;
        double alan;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yar��ap�n� giriniz: ");
        r = input.nextInt();
        System.out.print("Daire dilimini g�ren merkez a��n�n �l��s�n� giriniz: ");
        alpha = input.nextInt();

        alan = (Math.PI*(r*r)*alpha)/360;
        System.out.println("Daire diliminin alan�: " +alan);

	}

}
