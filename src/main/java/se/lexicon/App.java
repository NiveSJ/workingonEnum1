package se.lexicon;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        System.out.println("Which dice You want to roll\n if Dice6(press1) D10(Press2) D20 (Press 3) D100(Press4) Press 0 to exit ");
        Scanner scan = new Scanner(System.in);
        while (true){
        switch (scan.nextInt()) {
            case 1:
                Dice dice = Dice.D6;
                int values = dice.getMAX_VALUES();
                int max_values = dice.roll(values);
                System.out.println("You have rolled:" + max_values);
                break;
            case 2:
                Dice dice1 = Dice.D10;
                int values1 = dice1.getMAX_VALUES();
                int max_values1 = dice1.roll(values1);
                System.out.println("You have rolled:" + max_values1);
                break;
            case 3:
                Dice dice3 = Dice.D20;
                int values3 = dice3.getMAX_VALUES();
                int max_values3 = dice3.roll(values3);
                System.out.println("You have rolled:" + max_values3);
                break;
            case 4:
                Dice dice4 = Dice.D100;
                int values4 = dice4.getMAX_VALUES();
                int max_values4 = dice4.roll(values4);
                System.out.println("You have rolled:" + max_values4);
                break;
            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("press valid option");
        }


        }
    }
}
