package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Dice dice = Dice.D10;
        int values = dice.getMAX_VALUES();
        int max_values = dice.roll(values);
        System.out.println(max_values);


    }
}
