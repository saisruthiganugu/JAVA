import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Minimum Priority Queue
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);
        minPQ.forEach((Integer val)-> System.out.print(val+" "));
        System.out.println();
        System.out.println("Now removing all the minPQ elements");
        //Now remove all the PQ elements
        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println(val);
        }
    }
}
