public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Jimi", calculateHighScorePosition(1500));
        displayHighScorePosition("James", calculateHighScorePosition(1000));
        displayHighScorePosition("Jill", calculateHighScorePosition(500));
        displayHighScorePosition("Jonas", calculateHighScorePosition(100));
        displayHighScorePosition("Joey", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score list");

    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
