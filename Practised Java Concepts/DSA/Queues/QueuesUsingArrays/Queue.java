package QueuesUsingArrays;

import java.util.Arrays;

public class Queue {

    protected int[] arr;
    protected int size;
    protected int front;
    public static final int defaultCapacity = 10;

    public Queue() throws Exception {
        this(defaultCapacity);
    }

    public Queue(int capacity) throws Exception {

        if (capacity < 1) {
            throw new Exception("Invalid Capacity");
        }

        this.arr = new int[capacity];
        this.size = 0;
        this.front = 0;

    }

    public void enqueue(int value) throws Exception {
        // if Queue is full
        if (this.size == this.arr.length) {
            throw new Exception("Queue is full");
        }

        int rear = (this.front + this.size) % this.arr.length;
        this.arr[rear] = value;
        this.size++;
    }

    public int dequeue() throws Exception {
        // if Queue is empty
        if (this.size == 0) {
            throw new Exception("Queue is empty");
        }

        int ans = this.arr[this.front];
        this.front = (this.front + 1) % this.arr.length;

        int rear = (this.front + this.size) % this.arr.length;
        this.size--;
        return ans;
    }

    public int peek() throws Exception {
        if (this.size == 0) {
            throw new Exception("Queue is empty");
        }
        return this.arr[this.front];
    }

    public boolean empty() {
        return this.size == 0;
    }

    public boolean full() {
        return this.size == this.arr.length;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            int idx = (this.front + i) % this.arr.length;
            System.out.print(this.arr[idx] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

       // Queue q = new Queue();
        Queue q = new DynamicQueue();
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