package example.T19_UtilRandom;

import java.util.Random;

public final class UtilRandom {
    private static final Random random = new Random();
    private static final int DEFAULT = 10;

    private UtilRandom() {
    }

    static public int getRandom() {
        return random.nextInt(DEFAULT);
    }

    static public int getRandom(int r) {
        return random.nextInt(r);
    }
}
