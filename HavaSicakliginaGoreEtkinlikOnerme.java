import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava s�cakl��� ka� santigrat derece?: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5)
            System.out.println("�neri : Kayak yapabilirsin");
        else if (sicaklik < 15)
            System.out.println("�neri : Sinemaya gidebilirsin");
        else if (sicaklik < 25)
            System.out.println("�neri : Pikni�e gidebilirsin");
        else
            System.out.println("�neri : Y�zmeye gidebilirsin");
        

	}

}
