package Stack;

import java.util.*;

public class linkStack {
    static class Node {
        int Data;
        Node next;

        public Node(int Data) {
            this.Data = Data;
            this.next = null;

        }

    }

    static class Stack {
        static Node head = null;
        int Data;

        public static boolean isEmpty() {
            return head == null;

        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.Data;
            head = head.next;
            return top;

        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.Data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }

}
