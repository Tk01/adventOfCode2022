package day2;

import java.lang.reflect.Array;
import java.util.Arrays;

class CheatSheetEntry {

    private GameAction enemyMove;
    private GameOutcome outcome;

     CheatSheetEntry(GameAction enemyMove, GameOutcome outcome) {
        this.enemyMove = enemyMove;
        this.outcome = outcome;
    }


    Game toGame() {
        return new Game(enemyMove, this.determineAction());

    }

     private GameAction determineAction() {
         switch (outcome){
             case WIN: return this.determineWin();
             case DRAW: return this.determineDraw();
             case LOSS: return determineLoss();
         }
         return null;
     }

     private GameAction determineDraw() {
        return Arrays.stream(GameAction.values()).filter(gameAction -> gameAction!=determineLoss()).filter(gameAction -> gameAction!=determineWin()).findFirst().orElseThrow(IllegalArgumentException::new);
     }

     private GameAction determineLoss() {
         return GameTable.getxBeatsYTable().get(enemyMove);
     }

     private GameAction determineWin() {
         return GameTable.getxBeatsYTable().entrySet().stream().filter(set-> set.getValue() == enemyMove).findFirst().orElseThrow(IllegalArgumentException::new).getKey();
     }

     @Override
     public String toString() {
         return "CheatSheetEntry{" +
                 "enemyMove=" + enemyMove +
                 ", outcome=" + outcome +
                 ", yourMove=" + determineAction() +
                 '}';
     }
 }
