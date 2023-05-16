package helper;

public class MaxSizeQueue<T> 
{
    private int maxSize;
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    public MaxSizeQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = (T[]) new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void enqueue(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        T item = queue[front];
        front = (front + 1) % maxSize;
        size--;
        return item;
    }

    public int size() {
        return size;
    }
}
