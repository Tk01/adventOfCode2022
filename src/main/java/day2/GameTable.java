package day2;

import java.util.HashMap;

public class GameTable {
    private static final HashMap<GameAction, GameAction> xBeatsYTable;

    static {
        xBeatsYTable = new HashMap<>();
        xBeatsYTable.put(GameAction.ROCK, GameAction.SCISSORS);
        xBeatsYTable.put(GameAction.PAPER, GameAction.ROCK);
        xBeatsYTable.put(GameAction.SCISSORS, GameAction.PAPER);
    }

    public static HashMap<GameAction, GameAction> getxBeatsYTable() {
        return xBeatsYTable;
    }
}
