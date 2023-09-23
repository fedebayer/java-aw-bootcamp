package bDataStructuresAndAlgo;

public class StackWithoutCollections<T> {
    private Object[] elements;
    private int size;
    private int top;

    public StackWithoutCollections(int capacity) {
        elements = new Object[capacity];
        size = 0;
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(T element) {
        if (size == elements.length) {
            throw new IllegalStateException("The stack is full");
        }
        elements[++top] = element;
        size++;
    }

    // Method to pop and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        T element = (T) elements[top];
        elements[top--] = null;
        size--;
        return element;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the stack
    public int size() {
        return size;
    }

    public void printStack() {
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) {
        StackWithoutCollections<Integer> stack = new StackWithoutCollections<>(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size()); // Should display 3

        stack.printStack(); // Should display the contents of the stack

        int removedElement = stack.pop();
        System.out.println("Element removed from the stack: " + removedElement); // Should display 3

        System.out.println("Stack size after removal: " + stack.size()); // Should display 2
    }
}
