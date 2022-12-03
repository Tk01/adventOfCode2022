package day1;
;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CalorieCalculator {
    public static int calculateMaximum(HashMap<Integer, List<Integer>> input) {
        return input.values().stream().mapToInt(CalorieCalculator::calculateCalories).max().getAsInt();
    }

    public static List<Integer> calculateTop(HashMap<Integer, List<Integer>> input, int top) {
        return input.values().stream().mapToInt(CalorieCalculator::calculateCalories).sorted().skip(input.size()-top).boxed().collect(Collectors.toList());
    }

    private static int calculateCalories(List<Integer> elfInventory) {
       return elfInventory.stream().mapToInt(Integer::intValue).sum();
    }
}
