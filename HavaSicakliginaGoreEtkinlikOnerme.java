import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sýcaklýðý kaç santigrat derece?: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5)
            System.out.println("Öneri : Kayak yapabilirsin");
        else if (sicaklik < 15)
            System.out.println("Öneri : Sinemaya gidebilirsin");
        else if (sicaklik < 25)
            System.out.println("Öneri : Pikniðe gidebilirsin");
        else
            System.out.println("Öneri : Yüzmeye gidebilirsin");
        

	}

}
