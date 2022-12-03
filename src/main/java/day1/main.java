package day1;

import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args)  {
        HashMap<Integer, List<Integer>> input = InputParser.getInput();
        System.out.println(CalorieCalculator.calculateMaximum(input));
        System.out.println(CalorieCalculator.calculateTop(input,3));
        System.out.println(CalorieCalculator.calculateTop(input,3).stream().mapToInt(Integer::intValue).sum());

    }

}
