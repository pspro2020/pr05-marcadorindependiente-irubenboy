package classes;

import java.util.Random;

public class Task implements Runnable{

    private Dice dice;

    public Task(Dice dice){
        this.dice = dice;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Random r = new Random();
            int number = r.nextInt(6)+1;
            dice.throwDice(number);
        }
    }
}
