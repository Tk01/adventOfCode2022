package day6;

import day5.Instruction;
import day5.TowersAndInstructions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day6InputParser {

    public static CharParser getInput() {
        return new CharParser(new BufferedReader(
                new InputStreamReader(Day6InputParser.class.getResourceAsStream("/day6/input.txt"),
                        Charset.forName("UTF-8"))));
        }

}
