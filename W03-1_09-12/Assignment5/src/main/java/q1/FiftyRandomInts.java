package q1;

import java.util.Random;

public class FiftyRandomInts {

	void genFiftyRandomInts(int[] numContainer, Random random) {
		for (int i = 0; i < 50; i++) {
			numContainer[i] = random.nextInt();
		}
	}

	void compareInts(int[] numContainer) {
		int count = 1;
		for (int i = 0; i < 50; i++) {

			if ((i + 1) != 50) {

				if (numContainer[i] < numContainer[i + 1]) {
					System.out.println(
							"Comparison #" + count + ": " + numContainer[i] + " less than " + numContainer[i + 1]);

				} else if (numContainer[i] > numContainer[i + 1]) {
					System.out.println(
							"Comparison #" + count + ": " + numContainer[i] + " greater than " + numContainer[i + 1]);

				} else {
					System.out.println(
							"Comparison #" + count + ": " + numContainer[i] + " equals " + numContainer[i + 1]);
				}
			}
			count++;
		}
	}
}
