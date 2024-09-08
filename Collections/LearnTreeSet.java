// TreeSet in Java is a collection that implements the Set interface, 
// storing elements in a sorted order using a Red-Black Tree, and does not allow duplicate values.
import java.util.*;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
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
