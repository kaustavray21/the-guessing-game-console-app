package game;

public class Player {
    // This instance variable stores the number that a player has guessed.
    int number;

    // create a parameterized constructor
    public Player(int number) {
        this.number = number;
    }

    // Create a no arguments constructor
    public Player() {
        this.number = 0;
    }

    // Create a method to guess the number.
    public void guess() {
        number = (int) (Math.random() * 10.0);
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                '}';
    }
}
