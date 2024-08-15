package com.tommy.reactive.firstclass;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

class FirstClassObjectTest {

    @Test
    void firstClassConsumer() {
        Consumer<Integer> actual = FirstClassObject.getConsumer();
        actual.accept(20);
    }

    @Test
    void firstClassConsumerAsLambda() {
        Consumer<Integer> actual = FirstClassObject.getConsumerAsLambda();
        actual.accept(30);
    }

    @Test
    void handleConsumer() {
        Consumer<Integer> actual = FirstClassObject.getConsumer();
        FirstClassObject.handleConsumer(actual, 40);
    }
}
