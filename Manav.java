import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican, toplam;
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Armut ka� kilo ? : ");
        armut = input.nextDouble();
        System.out.print("Elma ka� kilo ? : ");
        elma = input.nextDouble();
        System.out.print("Domates ka� kilo ? : ");
        domates = input.nextDouble();
        System.out.print("Muz ka� kilo ? : ");
        muz = input.nextDouble();
        System.out.print("Patl�can ka� kilo ? : ");
        patlican = input.nextDouble();
        
        toplam = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
        System.out.print("Toplam Tutar: " + toplam);

	}

}
