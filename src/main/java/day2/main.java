package day2;



import java.util.List;

public class main {
    public static void main(String[] args)  {
        List<Game> input = Day2InputParser.getInputForPart1();
        System.out.println("part 1");
        System.out.println(input);
        System.out.println(input.stream().map(Game::getYourScore).mapToInt(Integer::intValue).sum());
        System.out.println("part 2");
        List<CheatSheetEntry> input2 = Day2InputParser.getInputForPart2();
        System.out.println(input);
        System.out.println(input2.stream().map(CheatSheetEntry::toGame).map(Game::getYourScore).mapToInt(Integer::intValue).sum());
    }

}
