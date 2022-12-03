package day2;

import java.util.HashMap;

public class Game {



    private GameAction yourMove;

    private GameAction enemyMove;

    public Game(GameAction enemyMove, GameAction yourMove) {
        this.yourMove = yourMove;
        this.enemyMove = enemyMove;
    }

    public int getYourScore() {
        return yourMove.getScore() + this.getOutCome(yourMove, enemyMove).getScore();
    }

    private GameOutcome getOutCome(GameAction yourMove, GameAction enemyMove) {
        if (GameTable.getxBeatsYTable().get(yourMove) == enemyMove) return GameOutcome.WIN;
        if (GameTable.getxBeatsYTable().get(enemyMove) == yourMove) return GameOutcome.LOSS;
        return GameOutcome.DRAW;
    }

    @Override
    public String toString() {
        return "Game{" +
                "yourMove=" + yourMove +
                ", enemyMove=" + enemyMove +
                ", score=" + getYourScore() +
                '}';
    }
}
