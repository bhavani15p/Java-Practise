public class StackUsingArray {

    public class Stack {
        private int top;
        private int[] arr;

        public Stack(int capacity) {
            top = -1;
            arr = new int[capacity];
        }

        public Stack() {
            this(10);
        }

        public int size() {
            return top + 1;
        }

        public boolean isStackFull() {
            return top == arr.length - 1;
        }

        public boolean isStackEmpty() {
            return top < 0;
        }

        public void push(int data) {
            if (isStackFull()) {
                throw new RuntimeException("Stack is full!");
            }
            top++;
            arr[top] = data;
        }

        public int pop() {
            if (isStackEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            int result = arr[top];
            top--;
            return result;
        }

        public void display() {
            if (isStackEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }

            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        Stack stack = stackUsingArray.new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped element: " + stack.pop());

        stack.display();
    }
}
