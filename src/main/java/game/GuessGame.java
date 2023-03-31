package game;

public class GuessGame {
    // GuessGame has three instance variables for the three player objects.
    Player playerOne;
    Player playerTwo;
    Player playerThree;

    // Create three player objects and assign them to three player instance variables.
    public void startGame() {
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();
    }
}

