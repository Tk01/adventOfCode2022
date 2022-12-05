package day5;

import java.util.List;
import java.util.Stack;

public class TowersAndInstructions {
    private List<Stack<String>> towers;
    private List<Instruction> instructionList;

    public TowersAndInstructions(List<Stack<String>> stackList, List<Instruction> instructionList) {
        this.towers = stackList;
        this.instructionList = instructionList;
    }

    public List<Stack<String>> getTowers() {
        return towers;
    }

    public List<Instruction> getInstructionList() {
        return instructionList;
    }

    public void executeWithCrateMover9000(Instruction instruction) {
        for(int i= 0; i<instruction.getNumberOfMoves();i++){
            towers.get(instruction.getTo()-1).push(towers.get(instruction.getFrom()-1).pop());
        }
    }

    public void executeWithCrateMover9001(Instruction instruction) {
        int grabbingPoint = towers.get(instruction.getFrom()-1).size()-instruction.getNumberOfMoves();
        for(int i= 0; i<instruction.getNumberOfMoves() ;i++){
            towers.get(instruction.getTo()-1).push(towers.get(instruction.getFrom()-1).remove(grabbingPoint));
        }
    }
}
