package day3;

import java.util.Map;

public class Compartement {
    private Map<Item, Long> content;

    public Compartement(Map<Item, Long> content) {
        this.content = content;
    }

    public Map<Item, Long> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Compartement{" +
                "content=" + content +
                '}';
    }
}
