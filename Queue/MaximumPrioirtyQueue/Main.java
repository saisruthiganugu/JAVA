import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Minimum Priority Queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a,Integer b)->b-a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);
        maxPQ.forEach((Integer val)-> System.out.print(val+" "));
        System.out.println();
        System.out.println("Now removing all the maxPQ elements");
        //Now remove all the PQ elements
        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println(val);
        }
    }
}
