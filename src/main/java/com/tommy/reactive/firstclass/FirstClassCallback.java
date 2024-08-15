package com.tommy.reactive.firstclass;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class FirstClassCallback {

    public static void main(String[] args) {
        log.info("Start main");

        FirstClassCallback.getResult(integer -> {
            var nextValue = integer + 5;
            assert nextValue == 5;
        });

        log.info("End main");
    }

    public static void getResult(Consumer<Integer> consumer)  {
        log.info("Start getResult");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        var result = 0;
        consumer.accept(result);
        log.info("End getResult");
    }
}
