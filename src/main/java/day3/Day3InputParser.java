package day3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3InputParser {
    public static List<BackPack> getInput() {
        List<BackPack> backPackList = new ArrayList<>();
        Scanner scanner = new Scanner(Day3InputParser.class.getResourceAsStream("/day3/input.txt"));
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            List<Compartement> compartments = getCompartements(line);
            backPackList.add(new BackPack(compartments));
        }
        return backPackList;
    }

    private static List<Compartement> getCompartements(String line) {
        return Stream.of(line.substring(0,line.length()/2), line.substring(line.length()/2))
                       .map(Day3InputParser::mapToCompartment)
                       .collect(Collectors.toList());
    }

    private static Compartement mapToCompartment(String inputString) {
        Map<Item, Long> itemMap = inputString.chars()
                .mapToObj(Day3InputParser::mapToItem)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
        return new Compartement(itemMap);
    }

    private static Item mapToItem(int itemCode) {
        return new Item(Character.isLowerCase(itemCode)? itemCode-96:itemCode-38);
    }

    public static List<Group> getInputForPart2() {
        List<Group> groupList = new ArrayList<>();
        Scanner scanner = new Scanner(Day3InputParser.class.getResourceAsStream("/day3/input.txt"));
        int i=0;
        List<BackPack> backPackList = null;
        while (scanner.hasNext()){
            if(i==0){
                backPackList= new ArrayList<>();
            }
            String line = scanner.nextLine();
            List<Compartement> compartments = getCompartements(line);
            backPackList.add(new BackPack(compartments));
            i=(i+1)%3;
            if(i==0){
                groupList.add(new Group(backPackList));
            }
        }
        return groupList;
    }
}
