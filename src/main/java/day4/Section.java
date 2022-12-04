package day4;

public class Section {
    private int start;
    private int end;

    public Section(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean fullOverlaps(Section other) {
        return this.start <= other.getStart() && this.end >= other.getEnd();
    }

    public boolean containsWork(Section other) {
        return other.fullOverlaps(this) || this.fullOverlaps(other) || (this.start <= other.getStart() && this.end >= other.getStart()) || (this.start <= other.getEnd() && this.end >= other.getEnd());
    }

    @Override
    public String toString() {
        return "Section{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }


}
