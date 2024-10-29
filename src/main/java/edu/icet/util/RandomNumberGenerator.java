package edu.icet.util;

import java.util.Random;

public class RandomNumberGenerator {
    private static RandomNumberGenerator instance;
    static Random random = new Random();
    private RandomNumberGenerator(){};

    public static RandomNumberGenerator getInstance(){
        return instance==null?instance = new RandomNumberGenerator():instance;
    }
    public int getNumber(int number){
        return random.nextInt(number);
    }
}
