package QueuesUsingArrayList;

import java.util.ArrayList;

public class Queue {

    protected ArrayList<Integer> arr;
    protected int front;
    public static final int defaultCapacity = 10;

    public Queue() {
        this(defaultCapacity);
    }

    public Queue(int capacity) {

        if (capacity < 1) {
            throw new IllegalArgumentException("Invalid Capacity");
        }

        this.arr = new ArrayList<>(capacity);
        this.front = 0;
    }

    public void enqueue(int value) {
        this.arr.add(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int ans = this.arr.get(this.front);
        this.front++;
        return ans;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return this.arr.get(this.front);
    }

    public boolean isEmpty() {
        return this.front == this.arr.size();
    }

    public int size() {
        return this.arr.size() - this.front;
    }

    public void display() {
        for (int i = this.front; i < this.arr.size(); i++) {
            System.out.print(this.arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(2);
        q.enqueue(9);

        q.dequeue();
        q.dequeue();

        q.enqueue(12);
        q.enqueue(15);

        q.display();
    }
}

