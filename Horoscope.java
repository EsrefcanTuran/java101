import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Please write the month you were born in (like January = 1): ");
        month = input.nextInt();

        System.out.print("Please write the day you were born on: ");
        day = input.nextInt();

        if (month == 1)
        	if (day >= 1 && day <= 31){
        		if (day <= 19)
        			System.out.println("Your zodiac sign is Capricorn.");
                else
                	System.out.println("Your zodiac sign is Aquarius.");
        	} else
        		System.out.println("You entered an invalid day.");

        if (month == 2)
        	if (day >= 1 && day <= 29){
        		if (day <= 18)
        			System.out.println("Your zodiac sign is Aquarius.");
        		else
        			System.out.println("Your zodiac sign is Pisces ");
        	} else
        		System.out.println("You entered an invalid day.");


        if (month == 3)
        	if (day >= 1 && day <= 31){
        		if (day <= 20)
        			System.out.println("Your zodiac sign is Pisces.");
        		else
        			System.out.println("Your zodiac sign is Aries.");
        	} else
        		System.out.println("You entered an invalid day.");


        if (month == 4)
        	if (day >= 1 && day<= 30){
        		if (day <= 19)
        			System.out.println("Your zodiac sign is Aries.");
        		else 
        			System.out.println("Your zodiac sign is Taurus.");
        	} else
        		System.out.println("You entered an invalid day.");

        if (month == 5)
        	if (day >= 1 && day <= 31){
        		if (day <= 20)
        			System.out.println("Your zodiac sign is Taurus.");
        		else
        			System.out.println("Your zodiac sign is Gemini.");
        	} else
        		System.out.println("You entered an invalid day.");


        if (month == 6)
        	if (day >=1 && day <= 30){
        		if (day <= 20)
        			System.out.println("Your zodiac sign is Gemini.");
        		else
        			System.out.println("Your zodiac sign is Cancer.");
        	}else
        		System.out.println("You entered an invalid day.");

        if (month == 7)
        	if (day >= 1 && day <= 31){
        		if (day <= 22)
        			System.out.println("Your zodiac sign is Cancer.");
        		else
        			System.out.println("Your zodiac sign is Leo.");
        	}else
        		System.out.println("You entered an invalid day");


         if (month == 8)
        	 if (day >= 1 && day <= 31){
        		 if (day <= 22)
        			 System.out.println("Your zodiac sign is Leo.");
                 else
                     System.out.println("Your zodiac sign is Virgo.");
        	 }else
        		 System.out.println("You entered an invalid day.");

          if (month == 9)
        	  if (day >= 1 && day <= 30){
        		  if (day <= 22)
        			  System.out.println("Your zodiac sign is Virgo.");
                  else
                      System.out.println("Your zodiac sign is Libra.");
              }else
            	  System.out.println("You entered an invalid day.");

          if (month == 10)
                if (day >= 1 && day <= 31){
                    if (day <= 22)
                    	System.out.println("Your zodiac sign is Libra.");
                    else
                        System.out.println("Your zodiac sign is Scorpio.");
                }else
                    System.out.println("You entered an invalid day.");


          if (month == 11)
                if (day >= 1 && day <= 30){
                    if (day <= 21)
                        System.out.println("Your zodiac sign is Scorpio.");
                    else
                        System.out.println("Your zodiac sign is Sagittarius.");
                }else
                    System.out.println("You entered an invalid day.");

          if (month == 12)
        	  if (day >= 1 && day <= 31){
        		  if (day <= 21)
                        System.out.println("Your zodiac sign is Sagittarius.");
        		  else
                        System.out.println("Your zodiac sign is Capricorn.");
        	  }else
        		  System.out.println("You entered an invalid day.");


	}

}
