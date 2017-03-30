package lab9;

import java.text.DecimalFormat;

public class SodaSurvey {

	public static void main(String[] args) {
		int[][] scores = { {3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
						   {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
						   {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
						   {1, 1, 1, 3, 1, 2, 1, 3, 2, 4} };
		
		final int sodas = scores.length;
		final int people = scores[0].length;
		
		int[] sodaSum = new int[sodas];
		int[] personSum = new int[people];
		
		for (int soda = 0; soda < sodas; soda++) {
			for (int person = 0; person < people; person++) {
				sodaSum[soda] += scores[soda][person];
				personSum[person] += scores[soda][person];
			}
		}
			
			DecimalFormat fmt = new DecimalFormat("0.#");
			System.out.println("Averages:\n");
			
			for (int soda = 0; soda < sodas; soda++) {
				System.out.println("Soda #" + (soda + 1) + ": "
						+ fmt.format((float) personSum[soda] / people));
			}
			
			System.out.println();
			
			for (int person = 0; person < people; person++) {
				System.out.println("Person #" + (person + 1) + ": "
						+ fmt.format((float) personSum[person] / sodas));
			}
			
			
	}
	
}
