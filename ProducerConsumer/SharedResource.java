package com.example.springOne;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception{
        //sharedBuffer is full, Producer must wait to produce
        while(sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full, Producer is waiting for Consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+ item);
        notify(); //notify consumer to consume
    }

    public synchronized int consume() throws Exception{
        //sharedBuffer is empty, consumer must wait to consume
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty,Consumer is waiting for Producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed: "+item);
        notify(); //notify producer to produce
        return item;
    }
}
