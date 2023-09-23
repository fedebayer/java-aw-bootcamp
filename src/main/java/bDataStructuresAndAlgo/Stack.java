package bDataStructuresAndAlgo;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> elements;

    public Stack() {
        elements = new LinkedList<>();
    }

    // Method to push an element onto the stack
    public void push(T element) {
        elements.addFirst(element);
    }

    // Method to pop and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        return elements.removeFirst();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack content:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
