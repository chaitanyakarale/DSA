package Stack;

import java.util.Stack;

public class NextGreater {
    public static void NextGreaterEle(int arr[], int NextGreater[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                NextGreater[i] = -1;
                s.push(i);
            } else {
                NextGreater[i] = arr[s.peek()];
                s.push(i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int NextGreater[] = new int[arr.length];
        NextGreaterEle(arr, NextGreater);
        for (int i = 0; i < NextGreater.length; i++) {
            System.out.println("Next Greater Element of " + arr[i] + " is " + NextGreater[i]);
        }
    }
}
