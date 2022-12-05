package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day5InputParser {

    public static TowersAndInstructions getInput() {
        List<Stack<String>> stackList = new ArrayList<>();
        Scanner scanner = new Scanner(Day5InputParser.class.getResourceAsStream("/day5/input.txt"));
        String line;
        while (scanner.hasNext() && (line = scanner.nextLine()).contains("[") ) {
            for (int i = 0; i*4 < line.length(); i++) {
                Stack<String> stack;
                if (stackList.size() <= i) {
                    stack = new Stack<>();
                    stackList.add(stack);
                } else {
                    stack = stackList.get(i);
                }

                char object = line.charAt((i *4) + 1);
                if (object != ' ') {
                    stack.add(0, String.valueOf(object));
                }
            }
        }

        scanner.nextLine();

        List<Instruction> instructionList = new ArrayList<>();
        while (scanner.hasNext()){
            line = scanner.nextLine();
            int fromLocation = line.indexOf("from");
            int toLocation = line.indexOf("to");

            instructionList.add(new Instruction(Integer.parseInt(line.substring(5,fromLocation-1)),Integer.parseInt(line.substring(fromLocation+5,toLocation-1)),Integer.parseInt(line.substring(toLocation+3))));
        }

        return new TowersAndInstructions(stackList,instructionList);
    }
}
