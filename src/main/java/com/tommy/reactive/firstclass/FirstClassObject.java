package com.tommy.reactive.firstclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class FirstClassObject {

    private static final Logger log = LoggerFactory.getLogger(FirstClassObject.class);

    public static Consumer<Integer> getConsumer() {
        Consumer<Integer> returnValue = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                log.info("value in interface: {}", integer);
            }
        };
        return returnValue;
    }

    public static Consumer<Integer> getConsumerAsLambda() {
        return integer -> log.info("value in lambda: {}", integer);
    }

    public static void handleConsumer(Consumer<Integer> consumer, Integer input) {
        log.info("handleConsumer");
        consumer.accept(input);
    }
}
