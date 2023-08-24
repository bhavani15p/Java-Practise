public class StackUsingLinkedListManually {

    public class Stack {
        private ListNode top;
        private int length;
        private int capacity; 

        private class ListNode {
            private int data;
            private ListNode next;

            public ListNode(int data) {
                this.data = data;
            }
        }

        public Stack(int capacity) {
            top = null;
            length = 0;
            this.capacity = capacity;
        }

        public void push(int value) {
            if (isFull()) {
                throw new RuntimeException("Stack is full!");
            }
            ListNode newNode = new ListNode(value);
            newNode.next = top;
            top = newNode;
            length++;
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            int value = top.data;
            top = top.next;
            length--;
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public boolean isFull() {
            return length >= capacity;
        }

        public int size() {
            return length;
        }

        public void display() {
            ListNode currentNode = top;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedListManually outerInstance = new StackUsingLinkedListManually();
        Stack stack = outerInstance.new Stack(3); 

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
    }
}
