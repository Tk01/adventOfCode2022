package day7;

import day6.CharParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Day7InputParser {

    public static Node getInput() {
        Scanner scanner = new Scanner(Day7InputParser.class.getResourceAsStream("/day7/input.txt"));
        Folder start = new Folder("/", null);
        Folder current = start;
        String line = scanner.nextLine();
        boolean newLine = true;
        while (scanner.hasNext()) {
            if(newLine){
                line = scanner.nextLine();
            }
            newLine=true;
            if (line.startsWith("$ ls")){
                line = scanner.nextLine();
                while ( !line.contains("$ ") ) {
                    if(line.startsWith("dir")) {
                        current.getNext().add(new Folder(line.substring(4),current));
                    } else {
                        String[] split = line.split(" ");
                        current.getNext().add(new File(split[1],Long.parseLong(split[0]),current));
                    }
                    if(!scanner.hasNext()) break;
                    line = scanner.nextLine();
                    newLine = false;
                }
            } else if(line.startsWith("$ cd ..")){
                current = current.moveUp();
            } else if(line.startsWith("$ cd /")){
                current = start;
            } else {
                current =  current.moveDown(line.substring(5));
            }
        }

        return start;

    }

}
