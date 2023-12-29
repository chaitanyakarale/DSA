package Stack;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static int maxArea(int arr[]) {
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
                s.push(i);
            } else {
                nsr[i] = s.peek();
                s.push(i);
            }
        }

        // next smaller left
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
                s.push(i);
            } else {
                nsl[i] = s.peek();
                s.push(i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int width = (nsr[i] - nsl[i] - 1);
            int area = arr[i] * width;

            maxArea = Math.max(area, maxArea);

        }
        return maxArea;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Max Area " + maxArea(arr));
    }
}
