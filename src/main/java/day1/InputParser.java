package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputParser {
    public static HashMap<Integer, List<Integer>> getInput() {
        HashMap<Integer, List<Integer>> input = new HashMap<>();

        int elfNumber = 0;
        List<Integer> elfCalories = new ArrayList<>();
        input.put(elfNumber, elfCalories);

        Scanner scanner = new Scanner(InputParser.class.getResourceAsStream("/day1/part1/input.txt"));
        for (String line = scanner.nextLine(); scanner.hasNext(); line = scanner.nextLine()){
            if(line.length() == 0){
                elfNumber++;
                elfCalories = new ArrayList<>();
                input.put(elfNumber, elfCalories);
            } else {
                elfCalories.add(Integer.parseInt(line));
            }
        }
        return input;
    }
}
