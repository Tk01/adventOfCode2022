package day7;

import java.util.stream.Stream;

public interface Node {

    String getName();

    boolean isFolder();

    Node moveUp();

    Node moveDown(String nodeName);

    long getWeight();

    Stream<Node> unfold();

}
