package com.example.demo;

import java.util.concurrent.*;

public class ThreadPoolExecutorMain {
    public static void main(String[] args){
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(2), new CustomThreadFactor(), new CustomRejectionHandler());
        poolExecutor.allowCoreThreadTimeOut(true);
        for(int i=1;i<=7;i++){
            poolExecutor.submit(()-> {
                try{
                    Thread.sleep(5000);
                    System.out.println("Thread name: "+Thread.currentThread().getName());
                }catch(Exception ex){
                    //Exception is handled here
                }
            });
        }
        poolExecutor.shutdown();
    }

    private static class CustomThreadFactor implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r);
        }
    }

    private static class CustomRejectionHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            //logging
            System.out.println("Task Denied: "+r.toString());
        }
    }
}
