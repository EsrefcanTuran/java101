import java.util.Scanner;

public class SinifiGecmeDurumu {

	public static void main(String[] args) {
		int mat, fzk, kmy, trc, mzk;
	    double dersSayisi = 0, toplam = 0, ortalama;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Matematik Notunuz: ");
	    mat = input.nextInt();
	    if(mat >= 0 & mat <= 100){
	    		dersSayisi ++;
	    		toplam += mat;
	    }

	    System.out.print("Fizik Notunuz: ");
	    fzk = input.nextInt();
	    if(fzk >= 0 & fzk <= 100){
	    		dersSayisi ++;
	    		toplam += fzk;
	    }

	    System.out.print("Kimya Notunuz: ");
	    kmy = input.nextInt();
	    if(kmy >= 0 & kmy <= 100){
	    		dersSayisi ++;
	    		toplam += kmy;
	    }

	    System.out.print("Türkçe Notunuz: ");
	    trc = input.nextInt();
	    if(trc >= 0 & trc <= 100){
	    		dersSayisi ++;
	    		toplam += trc;
	    }

	    System.out.print("Müzik Notunuz: ");
	    mzk = input.nextInt();
	    if(mzk >= 0 & mzk <= 100){
	    		dersSayisi ++;
	    		toplam += mzk;
	    }
	    
	    ortalama = toplam / dersSayisi;
	    System.out.println("Ortalamanýz: " + ortalama);
	    System.out.println((ortalama > 55) ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");

	}

}
