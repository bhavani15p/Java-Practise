import java.util.LinkedList;

public class StackUsingLinkedList {

    public static class Stack {
        private LinkedList<Integer> data;

        public Stack() {
            data = new LinkedList<>();
        }

        public int size() {
            return data.size();
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }

        public void push(int value) {
            data.addFirst(value);
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            int value = data.removeFirst();
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            int value = data.getFirst();
            return value;
        }

        public void display() {
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
    }
}
