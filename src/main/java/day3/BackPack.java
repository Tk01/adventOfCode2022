package day3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BackPack {
    private List<Compartement> compartments;

    public BackPack(List<Compartement> compartments) {
        this.compartments = compartments;
    }

    public List<Compartement> getCompartments() {
        return compartments;
    }

    public Set<Item> getItemTypesInMultipleCompartments(){
        HashSet<Item> itemTypesInMultipleCompartments = new HashSet<>();
        return compartments.stream()
                .flatMap(compartement -> compartement.getContent().keySet().stream())
                .collect(Collectors.groupingBy(t->t,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "BackPack{" +
                "compartments=" + compartments +
                '}';
    }

    public Set<Item> getAllItemTypes() {
        return compartments.stream()
                .flatMap(compartement -> compartement.getContent().keySet().stream())
                .collect(Collectors.toSet());
    }
}
