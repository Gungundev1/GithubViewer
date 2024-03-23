import java.util.Scanner;
import java.util.Random;

class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerScore = 0;
        int userScore = 0;
        while (true) {
            System.out.println("Enter your move: rock, paper, scissors or quit");
            String userMove = scanner.nextLine().toLowerCase();

            if (userMove.equals("quit")) {
                break;
            }

            int computerInt = random.nextInt(3);
            String computerMove;

            if (computerInt == 0) {
                computerMove = "rock";
            } else if (computerInt == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }

            System.out.println("Computer plays: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors"))
                    || (userMove.equals("scissors") && computerMove.equals("paper"))
                    || (userMove.equals("paper") && computerMove.equals("rock"))) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
        }
        if(computerScore>userScore)
            System.out.println("Computer Wins by" + "  " +computerScore+ "  " +" Score");
        else
            System.out.println("User Wins by"+userScore+"Score");
        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }
}