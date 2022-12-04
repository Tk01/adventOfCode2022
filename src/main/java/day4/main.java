package day4;



import java.util.List;

public class main {
    public static void main(String[] args)  {
        List<List<Section>> input = Day4InputParser.getInput();
        System.out.println(input.stream().filter(group -> group.get(0).fullOverlaps(group.get(1)) || group.get(1).fullOverlaps(group.get(0))).count());
        System.out.println(input.stream().filter(group -> group.get(0).containsWork(group.get(1))).count());
    }

}
