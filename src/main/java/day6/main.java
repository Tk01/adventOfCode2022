package day6;



import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        CharParser input = Day6InputParser.getInput();
        System.out.println(input.findMarker(4));
        input = Day6InputParser.getInput();
        System.out.println(input.findMarker(14));

    }

}
