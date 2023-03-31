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

        // Declare 3 variables to hold a true or false based on the player's answer.
        boolean playerOneIsRight = false;
        boolean playerTwoIsRight = false;
        boolean playerThreeIsRight = false;

        // Make 'target' number that the players have to guess.
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 ...");

        while (true) {
            // print the target number on the console for help
            System.out.println("targetNumber = " + targetNumber);

            // call each player's guess method to make them guess a number
            playerOne.guess();
            playerTwo.guess();
            playerThree.guess();

            // get each player's guess(the result of their guess() method running) by accessing the member
            // variable of each player via its getter method
            guessPlayerOne = playerOne.getNumber();
            System.out.println("guessPlayerOne = " + guessPlayerOne);

            guessPlayerTwo = playerTwo.getNumber();
            System.out.println("guessPlayerTwo = " + guessPlayerTwo);

            guessPlayerThree = playerThree.getNumber();
            System.out.println("guessPlayerThree = " + guessPlayerThree);

            // check each player's guess to see if it matches the target number, if a player is right, then set that
            // player's variable to be true (remember, we set it false by default)
            if (guessPlayerOne == targetNumber) {
                playerOneIsRight = true;
            }

            if (guessPlayerTwo == targetNumber) {
                playerTwoIsRight = true;
            }

            if (guessPlayerThree == targetNumber) {
                playerThreeIsRight = true;
            }

            // if player one OR player two OR player three is right (the || operator means OR)
            if (playerOneIsRight || playerTwoIsRight || playerThreeIsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + playerOneIsRight);
                System.out.println("Player two got it right? " + playerTwoIsRight);
                System.out.println("Player three got it right? " + playerThreeIsRight);
                break;
            } else {
                System.err.println("Please try again!!!!");
            }
        }
    }
}

