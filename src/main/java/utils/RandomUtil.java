package utils;


import java.util.Random;

public class RandomUtil {
    Random random = new Random();

    public int randomNumber(int number) {
        return random.nextInt(number);
    }
}
