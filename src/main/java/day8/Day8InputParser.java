package day8;

import day7.File;
import day7.Folder;
import day7.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day8InputParser {

    public static List<List<Tree>> getInput() {
        Scanner scanner = new Scanner(Day8InputParser.class.getResourceAsStream("/day8/input.txt"));
        List<List<Tree>> treeGrid=new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            treeGrid.add(Stream.of(line.split("")).map(Integer::parseInt).map(height-> new Tree(height,false)).collect(Collectors.toList()));
        }
        return treeGrid;

    }

}
