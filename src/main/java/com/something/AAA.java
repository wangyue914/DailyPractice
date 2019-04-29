package com.something;

import java.io.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/**
 * Created by yue on 17-9-30 上午11:18.
 **/
public class AAA {
    public static void testThen() throws ExecutionException, InterruptedException {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            return "zero";
        });
        System.out.println("f1= "+f1.get());

        /*CompletableFuture<Integer> f2 = f1.thenApply(new Function<aboutstring, Integer>() {

            @Override
            public Integer apply(aboutstring t) {
                System.out.println(2);
                return Integer.valueOf(t.length());
            }
        });*/
        CompletableFuture<Integer> f2 =  f1.thenApply(t -> {
             return t.length();
        });
        System.out.println("f2= "+f2.get());

        CompletableFuture<Double> f3 = f2.thenApply(r -> r * 2.0);
        System.out.println(f3.get());
    }

    public static void testThenAccept(){
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            return "zero";
        });
        f1.thenAccept(e -> {
            System.out.println("get result:"+e);
        });
    }
    /**
     * future完成处理
     */

    public static void testThenRun(){
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            return "zero";
        });
        f1.thenRun(new Runnable() {
            @Override
            public void run() {
                System.out.println("finished");
            }
        });
    }

    public static void main(String[] args) throws Exception {
        testThenAccept();
    }

}
