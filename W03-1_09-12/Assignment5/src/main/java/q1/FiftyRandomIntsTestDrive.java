package q1;

import java.util.Random;

public class FiftyRandomIntsTestDrive {
	public static void main(String[] args) {
		Random random = new Random();
		FiftyRandomInts task = new FiftyRandomInts();

		int[] numContainer = new int[50];

		task.genFiftyRandomInts(numContainer, random);

		task.compareInts(numContainer);

	}
}
