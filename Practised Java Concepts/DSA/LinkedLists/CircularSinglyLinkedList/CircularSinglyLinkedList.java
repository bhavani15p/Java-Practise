import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length; // holds size of csll

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void CircularSinglyLinkedList() {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

    }

    public void display() {
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next =  temp;
        length++;
    }

    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirsttNode(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular Singly Linked List is empty");
        }
        ListNode temp = last.next;
        if(last.next == last){
            last =  null;
        }else{
            last.next = temp.next;
        }
        temp.next =  null;
        length--;
        return temp;
    }

    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        // csll.CircularSinglyLinkedList();
        // csll.display();

        // csll.insertFirst(1);
        // csll.insertFirst(10);
        // csll.insertFirst(15);
        // csll.insertFirst(17);
        // csll.display();

        csll.insertLast(1);
        csll.insertLast(10);
        csll.insertLast(15);
        csll.insertLast(17);
        csll.display();

        csll.removeFirsttNode();
        csll.display();


    }
}