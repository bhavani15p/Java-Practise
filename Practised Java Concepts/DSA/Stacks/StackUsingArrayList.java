import java.util.ArrayList;

public class StackUsingArrayList {

    public static class Stack {
        private ArrayList<Integer> data;

        public Stack() {
            data = new ArrayList<>();
        }

        public int size() {
            return data.size();
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }

        public void push(int value) {
            data.add(value);
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            int value = data.remove(data.size() - 1);
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            int value = data.get(data.size() - 1);
            return value;
        }

        public void display() {
            for (int i = data.size() - 1; i >= 0; i--) {
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

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack size: " + stack.size());

        stack.display();
    }
}
