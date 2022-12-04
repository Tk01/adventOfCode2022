package day4;

import day3.BackPack;
import day3.Compartement;
import day3.Group;
import day3.Item;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day4InputParser {

    public static List<List<Section>> getInput() {
        List<List<Section>> groupList = new ArrayList<>();
        Scanner scanner = new Scanner(Day4InputParser.class.getResourceAsStream("/day4/input.txt"));
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] sectionSplit = line.split(",");
            ArrayList<Section> list = new ArrayList<>();
            for(String section : sectionSplit){
                String[] startEnd = section.split("-");
                list.add(new Section(Integer.parseInt(startEnd[0]),Integer.parseInt(startEnd[1])));
            }
            groupList.add(list);
        }
        return groupList;
    }
}
