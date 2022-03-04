import java.util.Scanner;

/* Kural : Girilen say� 0 veya negatif oldu�u yere kadar girilen 
 * say�dan 5 rakam�n� ��kar�n. Her ��karma i�lemi s�ras�nda ekrana 
 * son de�eri yazd�r�n. Say� negatif veya 0 olduktan sonra 
 * tekrar 5 ekleyin. Yine her ekleme i�leminde say�n�n son de�erini 
 * ekrana yazd�r�n.
Senaryolar
N Say�s� : 16
��kt�s� : 16 11 6 1 -4 1 6 11 16 
N Say�s� : 10
��kt�s� : 10 5 0 5 10 
N Say�s� : 25
��kt�s� : 25 20 15 10 5 0 5 10 15 20 25 
N Say�s� : 5
��kt�s� : 5 0 5 */

public class DeseneGoreRecursiveMetot {
	
	static void desen(int n) {
		System.out.print(n +" ");
		if (n <= 0)
			return;
		desen(n-5);
		System.out.print(n +" ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N Say�s� : ");
		int n = input.nextInt();
		desen(n);
	}

}
