package com.example.springOne;

public class ProducerConsumer {
    public static void main(String[] args){
        SharedResource obj = new SharedResource(2);
        Thread producer = new Thread(
            () -> {
                try{
                    for(int i=1;i<=6;i++){
                        obj.produce(i);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        );
        Thread consumer = new Thread(
                () -> {
                    try {
                        for(int i=1;i<=6;i++){
                            obj.consume();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        producer.start();
        consumer.start();
    }
}
