import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class insertionsort {

    public static void insertionsort(Integer a[]) {
        for (int i = 1; i < a.length; i++) {
            Integer curr = a[i];
            Integer prev = i - 1;
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = curr;

        }
    }

    public static void main(String[] args) {
        Integer a[] = { 5, 4, 1, 3, 2 };
        // insertionsort(a);

        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
