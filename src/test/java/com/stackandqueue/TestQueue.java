package com.stackandqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQueue {

    @Test
    public void given3IntegersWhenEnqueuedShouldBeLast() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Queue<Integer> Queue = new Queue<>();

        Queue.enqueue(firstNode);
        Queue.enqueue(secondNode);
        Queue.enqueue(thirdNode);

        Queue.printQueue();

        Assertions.assertEquals( Queue.latestKeyOfQueue(), firstNode);

    }

    @Test
    public void whenDequeuedTailShouldBeMovedBackOneNode() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(firstNode);
        queue.enqueue(secondNode);
        queue.enqueue(thirdNode);

        queue.dequeue();

        queue.printQueue();

        Assertions.assertEquals(queue.firstKeyOfQueue(), secondNode);
    }
}
