import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int n1, n2, ebob = 1, ekok = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk Sayý: ");
		n1 = input.nextInt();
		System.out.print("Ýkinci Sayý: ");
		n2 = input.nextInt();

		int i = 1;
        if (n1 < n2){
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i ==0){
                    ebob = i;
                }
                i++;
            }
        }else{
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i ==0){
                    ebob = i;
                }
                i++;
            }
        }

        int k = 1;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0){
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println("EBOB: "+ ebob);
        System.out.println("EKOK: "+ ekok);

	}

}
