package game;

public class GuessGame {
    // GuessGame has three instance variables for the three player objects.
    Player playerOne;
    Player playerTwo;
    Player playerThree;

    public void startGame() {
        // Create three player objects and assign them to three player instance variables.
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();

        // Declare 3 variables to hold the 3 guesses that the Players make.
        int guessPlayerOne = 0;
        int guessPlayerTwo = 0;
        int guessPlayerThree = 0;

    }
}

