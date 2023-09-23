package bDataStructuresAndAlgo;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> elements;

    public Queue() {
        elements = new LinkedList<>();
    }

    // Method to enqueue an element into the queue
    public void push(T element) {
        elements.addLast(element);
    }

    // Method to dequeue and return the front element from the queue
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty");
        }
        return elements.removeFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void printQueue() {
        System.out.println("Queue content:");
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        queue.printQueue(); // Should display 1, 2, 3 (the first element added is at the front)

        int removedElement = queue.pop();
        System.out.println("Element removed from the queue: " + removedElement);

        queue.printQueue(); // Should display 2, 3
    }
}
