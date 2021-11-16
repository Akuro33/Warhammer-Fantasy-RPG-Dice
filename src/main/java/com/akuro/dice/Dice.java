package com.akuro.dice;

import java.util.Arrays;
import java.util.Random;

public class Dice {
    Random random;

    public void roll(int diceNumber, int diceEyes, double min, boolean sum2diceTogether) {
        Random random = new Random();

        int[] diceSum = new int[diceNumber/2]; // deklaracja tablic o nieznanej wielkości
        int[] dice = new int[diceNumber];
        int sum = 0;
        int j=0;
        boolean minDiceSum = true;
        int counter =0;
        while (minDiceSum) {
            for (int i = 0; i < diceNumber; i++) {
                dice[i] = random.nextInt(diceEyes)+1;
                sum+=dice[i];
            }
            if (sum>min){
                minDiceSum=false;
            }else {
                sum=0;
                counter++;
            }
        }
        if (sum2diceTogether) {
            for (int i = 0; i < diceNumber; i++) {
                diceSum[j] = dice[i] + dice[i + 1];
                i++;
                j++;
            }
            Arrays.sort(diceSum);
            for (int i = 0; i < diceNumber / 2; i++) {
                System.out.println(diceSum[i]);
            }
        }
        else  {
            for (int i = 0; i < diceNumber; i++) {
            System.out.println(dice[i]);
        } }
        System.out.println("Sum: "+sum);
        System.out.println("Result after: "+counter+" rolls.");
        System.out.println(Arrays.toString(dice));
    }

}
