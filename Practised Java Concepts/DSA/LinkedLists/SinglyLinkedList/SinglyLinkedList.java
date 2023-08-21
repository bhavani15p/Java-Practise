package SinglyLinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null; // default
        }
    }

    // method to print elements of sll
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // finds length of nodes/sll
    public int length() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // insert from first
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // insert from last
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtGivenPos(int position, int value) {

        // 1 --> 4 --> 5
        // 1 --> 6 --> 4 --> 5
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;

        }
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public void deleteAtPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;

        }
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void removeKey(int key) {
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        temp.next = current.next;

    }

    public ListNode insertNodeInSortedList(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }

        newNode.next = current;
        temp.next = newNode;

        return head;

    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

    }

    public boolean searchKey(int key) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse() {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);

        // // linking or connecting four nodes together
        // sll.head.next = second; // 10 --> 1
        // second.next = third; // 10 --> 1 --> 8
        // third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null ("null" coz no
        // morenodes added after 11)

        // sll.insertFirst(12);
        // sll.insertFirst(14);
        // sll.insertFirst(16);
        // sll.insertFirst(7);
        // sll.insertFirst(4);

        // sll.insertLast(12);
        // sll.insertLast(14);
        // sll.insertLast(16);

        // // calling display for printing elements
        // sll.display();
        // // System.out.println("Length is: " + sll.length());

        // sll.insertAtGivenPos(5, 3);
        // sll.display();

        // System.out.println(sll.deleteFirst().data);
        // System.out.println(sll.deleteLast().data);
        // sll.display();

        // sll.deleteAtPosition(3);
        // sll.display();

        // sll.removeKey(7);
        // sll.display();

        // sll.insertNodeInSortedList(6);
        // sll.display();

        // sll.insertLast(1);
        // sll.insertLast(1);
        // sll.insertLast(2);
        // sll.insertLast(3);
        // sll.insertLast(3);
        // sll.display();
        // sll.removeDuplicates();
        // sll.display();

        // sll.insertLast(10);
        // sll.insertLast(8);
        // sll.insertLast(1);
        // sll.insertLast(11);
        // sll.display();
        // if(sll.searchKey(-1)){
        // System.out.println("Search key found ...!");
        // }else{
        // System.out.println("Search key not found ...!");
        // }

        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.display();
        sll.reverse();
        sll.display();

    }
}