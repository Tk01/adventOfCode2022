package day3;

import java.util.Objects;

public class Item {
    private int priority;

    public Item(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(priority, item.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }
}
