import java.util.Random;

public class RockPaperScissors {

    static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        boolean playerWon =
                (playerMove.equalsIgnoreCase("Rock")     && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper")    && computerMove.equalsIgnoreCase("Rock"))     ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));

        return playerWon ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        int rounds = 5;

        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};

        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];

        Random random = new Random();

        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < rounds; i++) {
            computerMoves[i] = MOVES[random.nextInt(MOVES.length)];
            results[i] = playRound(playerMoves[i], computerMoves[i]);

            if (results[i].equals("Player Wins")) {
                wins++;
            } else if (results[i].equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println("Round " + (i + 1) + " - Player: " + playerMoves[i]
                    + ", Computer: " + computerMoves[i] + " -> " + results[i]);
        }

        System.out.println();
        System.out.println("================ SUMMARY TABLE ================");
        System.out.printf("%-8s %-14s %-16s %s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-8d %-14s %-16s %s%n",
                    (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        System.out.println("-----------------------------------------------");

        double winPercentage = (wins * 100.0) / rounds;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
    }
}
