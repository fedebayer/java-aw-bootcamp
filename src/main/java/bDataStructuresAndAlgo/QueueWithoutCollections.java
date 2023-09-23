package bDataStructuresAndAlgo;

public class QueueWithoutCollections<T> {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public QueueWithoutCollections(int capacity) {
        elements = new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    // Method to enqueue an element into the queue
    public void push(T element) {
        if (size == elements.length) {
            throw new IllegalStateException("The queue is full");
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    // Method to dequeue and return the front element from the queue
    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("The queue is empty");
        }
        T element = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    // Method to check if the queue is empty
    public boolean empty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to print the contents of the queue
    public void printQueue() {
        System.out.println("Queue contents:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % elements.length;
            System.out.println(elements[index]);
        }
    }

    public static void main(String[] args) {
        QueueWithoutCollections<Integer> queue = new QueueWithoutCollections<>(5);

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Queue size: " + queue.size()); // Should display 3

        queue.printQueue(); // Should display the contents of the queue

        int removedElement = queue.pop();
        System.out.println("Element removed from the queue: " + removedElement); // Should display 1

        System.out.println("Queue size after removal: " + queue.size()); // Should display 2
    }
}
