package Utilities;

import java.util.Random;

public class FakerUtility {
	public static int randomNumberGenerator() {
		Random rand = new Random();
		int randomnumber = rand.nextInt(100000);
		return randomnumber;
	}

}