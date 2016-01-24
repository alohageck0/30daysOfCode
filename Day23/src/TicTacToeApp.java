import java.util.Scanner;

public class TicTacToeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Allows for cont games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            //setting up tokens
            System.out.println("Welcome to Tic Tac Toe. Pick character!");
            System.out.println();
            System.out.println("Enter a single character");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single chat of opponent on the board");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            //set up the game
            System.out.println();
            System.out.println("Now we can start the game, to play enter the number\nThe numbers go from 1-9 left to right");
            TicTacToe.printIndexBoard();
            System.out.println();
            //Lets play

            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.userMarker) {
                    //user turn
                    System.out.println("Your turn");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again " + spot + " is invalid");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else {
                    //AI turn
                    System.out.println("It is my turn");
                    //pick spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }
                //Print out new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();

            //Set up new game
            System.out.println("Do you want to play again? Enter Y");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();

        }

    }
}
