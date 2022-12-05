package day5;



import java.util.Stack;

public class main {
    public static void main(String[] args)  {

        TowersAndInstructions input = Day5InputParser.getInput();
        input.getInstructionList().forEach(input::executeWithCrateMover9000);
        System.out.println(input.getTowers().stream().map(Stack::peek).reduce("", String::concat));

        input = Day5InputParser.getInput();
        input.getInstructionList().forEach(input::executeWithCrateMover9001);
        System.out.println(input.getTowers().stream().map(Stack::peek).reduce("", String::concat));
    }

}
