package com.parking.system.multi_threading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public void demoMethod(){
        CompletableFuture.supplyAsync(()->"Hello").
                thenApply(result->result+"world")
                .thenAccept(System.out::println);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"World");
        future1.thenCombine(future2,(result1,result2)->result1+" "+result2)
                .thenAccept(System.out::println);
    }
}
