import java.util.*;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        // LinkedHashSet is a Java collection that combines the features of a HashSet and a LinkedList,
        //maintaining the insertion order of elements while allowing fast access and unique entries.
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);
        set.remove(54);
        System.out.println(set);
        System.out.println(set.contains(21));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
