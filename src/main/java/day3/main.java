package day3;



import java.util.List;

public class main {
    public static void main(String[] args)  {
        List<BackPack> input = Day3InputParser.getInput();
        System.out.println(input.stream().flatMap(backPack->backPack.getItemTypesInMultipleCompartments().stream()).mapToInt(Item::getPriority).sum());

        List<Group> inputForPart2= Day3InputParser.getInputForPart2();
        System.out.println(inputForPart2.stream().flatMap(group->group.getItemTypesInAllMembers().stream()).mapToInt(Item::getPriority).sum());

    }

}
