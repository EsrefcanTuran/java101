import java.util.Scanner;

public class VatCalculator {

	public static void main(String[] args) {
		double amount , vatRate, vatAmount, amountWithVat ;
		
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount: ");
        amount = input.nextDouble();
        if(amount > 1000){
            vatRate = 0.08 ;
        }
        else{
            vatRate = 0.18 ;
        }
        vatAmount = amount * vatRate ;
        amountWithVat = amount + vatAmount ;

        System.out.println("Amount Without VAT : " + amount);
        System.out.println("VAT Rate : " + vatRate);
        System.out.println("VAT Amount : " + vatAmount); 
        System.out.println("Amount With VAT : " + amountWithVat);

	}

}
