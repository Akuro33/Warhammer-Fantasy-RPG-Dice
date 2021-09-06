import dice.Dice;

import java.util.Scanner;



public class Main {



    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        int diceNumber = 16;
        int diceEyes = 10;
        double minimum = 100;
        boolean sum2DiceTogheter = true;
        System.out.println("Program to roll Stats for Warhammer 2nd Edition Role Play");
        System.out.println("To you have any request before roll? ");
        System.out.println("Standard Options:" );
        System.out.println("16d10, no less then 100, sum2dice together");
        System.out.println("Do you want change Option?\n" + "Y/N");
        String chose = scanner.next();
        if (chose.equalsIgnoreCase("Y")){
            System.out.println("What you want change?");

            System.out.println("1 - Dice, 2 - Set Minium of Roll, 3 - Sum2DiceTogether");
            String chose2 = scanner.next();
            switch (chose2) {
                    case "1":
                        System.out.println("Chose your Dice. How many dice?(This also change Minium to 60 % of max Roll)");
                        diceNumber = scanner.nextInt();
                        System.out.println("How many DiceEyes?");
                        diceEyes = new Scanner(System.in).nextInt();
                        minimum = diceNumber*diceEyes*0.60;
                        System.out.println("Minimum is: " + minimum);


                        break;
                case "2":
                    System.out.println("What minium do you want?:");
                    System.out.println("Rember: If you chose high value program can work long for found right Value");
                    minimum = scanner.nextInt();
                    break;
                case "3":
                    System.out.println("Don't do sum two dice together? (True/False)");
                    sum2DiceTogheter = scanner.next().equalsIgnoreCase("True");

                    break;
                default:
                    break;
                }

        } else
        {}






        new Dice().roll(diceNumber, diceEyes, minimum, sum2DiceTogheter);

    }
}
