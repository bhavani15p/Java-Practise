package QueuesUsingLinkedList;

import java.util.*;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int value) {
        ListNode temp = new ListNode(value);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;

    }

    public int dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;

    }

    public void print() {
        if (isEmpty()) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;

    }
    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return rear.data;

    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.print();


        // q.dequeue();
        // q.dequeue();
        
        // q.print();

        System.out.println(q.first());
         System.out.println(q.last());

    }

}
