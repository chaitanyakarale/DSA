package Stack;

import java.util.ArrayList;

public class ArrayListStack {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();
        int Data;

        public static boolean isEmpty() {
            return list.size() == 0;

        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int val = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int val = list.get(list.size() - 1);
            return val;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
