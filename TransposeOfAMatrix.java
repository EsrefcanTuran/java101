import java.util.Scanner;

public class TransposeOfAMatrix {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int r, c;
	    System.out.println("How many rows?: ");
	    r = input.nextInt();
	    System.out.println("How many columns?: ");
	    c = input.nextInt();
	    int matrix[][] = new int[r][c];
	    int transpose[][] = new int[c][r];
	    
	    System.out.println("Enter "+ matrix.length +" rows and "+ matrix[0].length + " columns: ");
	    for (int row = 0; row < matrix.length; row++) {
	        for (int column = 0; column < matrix[row].length; column++) {
	            matrix[row][column] = input.nextInt();
	        }
	    }
	    System.out.println("Given matrix : ");
	    for (int row = 0; row < matrix.length; row++) {
 		   for (int column = 0; column < matrix[row].length; column++) {
 		       System.out.print(matrix[row][column] + " "); 
 		   }
 		   System.out.println(); 
 		}
	    
	    for (int row = 0; row < transpose.length; row++) {
	        for (int column = 0; column < transpose[row].length; column++) {
	            transpose[row][column] = matrix[column][row];
	        }
	    }
	    System.out.println("Matrix after transpose : ");
	    for (int row = 0; row < transpose.length; row++) {
	    	for (int column = 0; column < transpose[row].length; column++) {
	    		System.out.print(transpose[row][column] + " "); 
	 		}
	    	System.out.println(); 
	 	}
	}

}
