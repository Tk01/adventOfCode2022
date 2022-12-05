package day5;

public class Instruction {
   private int numberOfMoves;
    private int from;
    private int to;

    public Instruction(int numberOfMoves, int from, int to) {
        this.numberOfMoves = numberOfMoves;
        this.from = from;
        this.to = to;
    }

    public int getNumberOfMoves() {
        return numberOfMoves;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "numberOfMoves=" + numberOfMoves +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
