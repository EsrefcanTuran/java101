import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, tarih, muzik;
		double ortalama;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik notunuz:  ");
		mat = input.nextInt();
		
		System.out.println("Fizik notunuz:  ");
		fizik = input.nextInt();
		
		System.out.println("Kimya notunuz:  ");
		kimya = input.nextInt();
		
		System.out.println("T�rk�e notunuz:  ");
		turkce = input.nextInt();
		
		System.out.println("Tarih notunuz:  ");
		tarih = input.nextInt();
		
		System.out.println("M�zik notunuz:  ");
		muzik = input.nextInt();
		
		ortalama = (double) (mat + fizik + kimya + turkce + tarih + muzik) / 6 ;
		System.out.println("Not ortalaman�z: " + ortalama);
		
		System.out.println(ortalama >= 60 ? "S�n�f� ge�tiniz" : "S�n�fta kald�n�z");

	}

}
