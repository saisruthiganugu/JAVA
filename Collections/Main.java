import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize the list and add elements
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(1);

        // Traverse elements using Iterator
        Iterator<Integer> it = values.iterator();
        System.out.println("Traverse elements using Iterator interface:");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Traverse elements using For Each loop
        System.out.println("Traverse elements using For Each:");
        values.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

        // List properties
        System.out.println("Size of the List: " + values.size());
        System.out.println("Is the List Empty: " + values.isEmpty());
        System.out.println("Does the list contain '3'? " + values.contains(3));

        // Convert List to Array
        Integer[] arr = values.toArray(new Integer[0]);
        System.out.println("Converting List to Array: " + Arrays.toString(arr));  // Convert array to string for display

        // Adding and removing elements
        System.out.println("Adding 4 to the list: " + values.add(4));
        System.out.println("Deleting 2 in the list: " + values.remove(Integer.valueOf(2)));

        // Stack operations and adding all elements to the list
        Stack<Integer> stack = new Stack<>();
        stack.add(5); stack.add(6); stack.add(7); stack.add(8); stack.add(9);
        System.out.println("Adding stack elements " + stack + " to the list: " + values.addAll(stack));
        System.out.println("List after adding stack elements: " + values);

        // Clearing the list
        values.clear();  // Better than using removeAll()
        System.out.println("Clearing all the values in the list.");
        System.out.println("Is it an empty list? " + values.isEmpty());
    }
}
