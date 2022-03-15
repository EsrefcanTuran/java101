
public class HarmonicMean {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		double denominator = 0, harmonicMean = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			denominator += 1.0 / numbers[i];
		}
		harmonicMean = numbers.length / denominator;
		
		System.out.println("Harmonic Mean: "+harmonicMean);

	}

}
