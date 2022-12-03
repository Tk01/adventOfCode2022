package day2;

public enum GameAction {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private final int score;


    GameAction(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }


}
