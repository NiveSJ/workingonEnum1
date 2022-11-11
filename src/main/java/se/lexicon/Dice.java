package se.lexicon;

import java.util.Random;

public enum Dice {


        D6(6),
        D10(10),
        D20(20),
        D100(100);


    public int getMAX_VALUES() {
        return MAX_VALUES;
    }

    private int MAX_VALUES;

        private Dice(int MAX_VALUES) {
            this.MAX_VALUES=MAX_VALUES;

        }


        public  int roll(int MAX_VALUES) {
            Random rand = new Random();
            return rand.nextInt(MAX_VALUES);

        }

    }




