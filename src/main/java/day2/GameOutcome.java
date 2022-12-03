package day2;

public enum GameOutcome {
    WIN(6),
    LOSS(0),
    DRAW(3);

    private final int score;

    GameOutcome(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
