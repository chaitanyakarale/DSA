import java.util.*;

public class arraypair {

    public static void pairs(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")");
            }

            System.out.println();

        }

    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 8, 10 };
        pairs(a);

    }

}
