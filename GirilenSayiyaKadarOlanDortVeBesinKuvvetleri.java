import java.util.Scanner;

public class GirilenSayiyaKadarOlanDortVeBesinKuvvetleri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Lütfen bir sýnýr sayýsý belirleyin : ");
        n = input.nextInt();
        
        System.out.println("Dördün kuvvetleri: ");
        for (int i = 1; i <= n; i *= 4)
            System.out.println(i);
        System.out.println("Beþin kuvvetleri: ");
        for (int j = 1; j <= n; j *= 5)
        	System.out.println(j);
        
    }
}