package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Folder implements Node {
    private String name;
    private Folder previous;
    private List<Node> next = new ArrayList<>();

    public Folder(String name, Folder previous) {
        this.name = name;
        this.previous = previous;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }

    @Override
    public Folder moveUp() {
        return previous;
    }

    @Override
    public Folder moveDown(String nodeName) {
        return (Folder) next.stream().filter(Node::isFolder).filter(node->node.getName().equals(nodeName)).findFirst().get();
    }

    @Override
    public long getWeight() {
        return next.stream().map(Node::getWeight).mapToLong(Long::longValue).sum();
    }

    public List<Node> getNext() {
        return next;
    }

    @Override
    public Stream<Node> unfold() {
        return Stream.concat(next.stream().flatMap(Node::unfold), Stream.of(this));
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}
