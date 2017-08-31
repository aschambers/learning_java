public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Alan", 500);
        System.out.println("New Score is: " + newScore);
    }

    public static int calculateScore(String playerName, int Score) {
        System.out.println("Player: " + playerName + ", Score: " + Score);
        return Score * 1000;
    }

    public static int calculateScore(String playerName, int Score) {
        System.out.println("Player: " + playerName + ", Score: " + Score);
        return Score * 1000;
    }
}
