import java.util.Scanner;

public class GirilenSayiyaKadarOlanDortVeBesinKuvvetleri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n;
        System.out.print("L�tfen bir s�n�r say�s� belirleyin : ");
        n = input.nextInt();
        
        System.out.println("D�rd�n kuvvetleri: ");
        for (int i = 1; i <= n; i *= 4)
            System.out.println(i);
        System.out.println("Be�in kuvvetleri: ");
        for (int j = 1; j <= n; j *= 5)
        	System.out.println(j);
        
    }
}