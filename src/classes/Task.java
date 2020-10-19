package classes;

public class Task implements Runnable{

    private Dice dice;

    public Task(Dice dice){
        this.dice = dice;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            dice.throwDice();
        }
    }
}
