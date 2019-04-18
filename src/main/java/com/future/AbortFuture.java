package com.wy.future;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author wangyue
 * @date 2019/4/12 15:59
 **/
public class AbortFuture {
    private static Random rand = new Random();
    private static long t = System.currentTimeMillis();
    public static class TestFuture{
         public CompletableFuture<String> getMoreData() {
            System.out.println("begin to start compute");
            /*try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            System.out.println("end to start compute. passed " + (System.currentTimeMillis() - t)/1000 + " seconds");
            CompletableFuture<String> future = new CompletableFuture<>();
            future.complete("Success");
            return future;
        }

    }

    public static void main(String[] args) throws Exception {
        TestFuture testFuture = new TestFuture();
        ExecutorService executorService = new ThreadPoolExecutor(10, 10,
                0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());

        CompletableFuture<String> future = testFuture.getMoreData();
        Future<String> f = future.whenComplete((v, e) -> {
            System.out.println(v);
            System.out.println(e);
        });
        System.out.println(f.get());
        System.in.read();
    }
}
