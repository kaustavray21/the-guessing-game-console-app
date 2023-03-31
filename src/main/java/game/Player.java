package game;

public class Player {
    // This instance variable stores the number that a player has guessed.
    int number;

    // Create a method to guess the number.
    public void guess() {
        number = (int) (Math.random() * 10.0);
    }

}
