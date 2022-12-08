package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class File implements Node {
    private String name;
    private Node previous;
    private long weight;

    public File(String name, long weight, Node previous) {
        this.name = name;
        this.weight = weight;
        this.previous = previous;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }

    @Override
    public Node moveUp() {
        return previous;
    }

    @Override
    public Node moveDown(String nodeName) {
        throw new IllegalStateException("no moving down for files");
    }

    public long getWeight() {
        return weight;
    }

    @Override
    public Stream<Node> unfold() {
        return Stream.of(this);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
