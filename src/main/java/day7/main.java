package day7;



import day6.CharParser;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        Node input = Day7InputParser.getInput();
        System.out.println(input.unfold().filter(Node::isFolder).map(Node::getWeight).filter(weight-> weight <=100000).mapToLong(Long::longValue).sum());
        long weight1 = input.getWeight();
        System.out.println(input.unfold().filter(Node::isFolder).map(Node::getWeight).filter(weight-> 30000000 <= (70000000-weight1+weight)).mapToLong(Long::longValue).min().getAsLong());

    }

}
