package day3;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Group {
    private List<BackPack> members;

    public Group(List<BackPack> members) {
        this.members = members;
    }

    public Set<Item> getItemTypesInAllMembers() {
        return members.stream()
                .flatMap(backPack -> backPack.getAllItemTypes().stream())
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == members.size())
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
