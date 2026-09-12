import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    static String draftAndRank(Player[] players) {
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            Player p = players[i];
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                count++;
            }
        }

        Player[] draftable = new Player[count];
        int index = 0;
        for (int i = 0; i < players.length; i++) {
            Player p = players[i];
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                draftable[index] = p;
                index++;
            }
        }

        Arrays.sort(draftable);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            result.append(i + 1).append(". ").append(draftable[i].name);
            if (i < draftable.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }
}

public class FantasyLeagueAutoDraftRankingEngine {

    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };
        System.out.println(Player.draftAndRank(players));
    }
}
