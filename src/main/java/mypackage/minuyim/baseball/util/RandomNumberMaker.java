package mypackage.minuyim.baseball.util;

import java.util.Random;

public class RandomNumberMaker {
    private static final int LENGTH_NUMBER = 3;

    public static int[] makeRandom() {
        Random random = new Random();
        int[] randomN = new int[LENGTH_NUMBER];

        for (int i = 0; i < randomN.length; i++) {
            randomN[i] = random.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                i -= compareN(randomN[i], randomN[j]);
            }
        }
        return randomN;
    }
    
    private static int compareN(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return 0;
        }
    }
}