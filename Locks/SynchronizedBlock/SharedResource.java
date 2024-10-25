package com.example.springOne.SynchronizedBlock;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void producer() {
        try {
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000); // Simulating some work
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Lock released by: " + Thread.currentThread().getName());
        }
    }
}
