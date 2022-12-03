package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Day2InputParser {
    static List<Game> getInputForPart1() {
       List<Game> input = new ArrayList<>();

        Scanner scanner = new Scanner(Day2InputParser.class.getResourceAsStream("/day2/input.txt"));
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] stringOutcomes = line.split(" ");
            input.add(new Game(mapToGameAction(stringOutcomes[0]),mapToGameAction(stringOutcomes[1])));
        }
        return input;
    }

    private static GameAction mapToGameAction(String stringOutcome) {
        switch (stringOutcome) {
            case "A":
            case "X":
                return GameAction.ROCK;
            case "B":
            case "Y":
                return GameAction.PAPER;
            case "C":
            case "Z":
                return GameAction.SCISSORS;
            default: throw new IllegalArgumentException();
        }
    }

     public static List<CheatSheetEntry> getInputForPart2() {
         List<CheatSheetEntry> input = new ArrayList<>();

         Scanner scanner = new Scanner(Day2InputParser.class.getResourceAsStream("/day2/input.txt"));
         while (scanner.hasNext()){
             String line = scanner.nextLine();
             String[] stringOutcomes = line.split(" ");
             input.add(new CheatSheetEntry(mapToGameAction(stringOutcomes[0]),mapToOutCome(stringOutcomes[1])));
         }
         return input;
     }

     private static GameOutcome mapToOutCome(String stringOutcome) {
         switch (stringOutcome) {
             case "X":
                 return GameOutcome.LOSS;
             case "Y":
                 return GameOutcome.DRAW;
             case "Z":
                 return GameOutcome.WIN;
             default: throw new IllegalArgumentException();
         }
     }
 }
