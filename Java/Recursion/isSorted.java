
public class sorted {
    public static void isSorted(int a[], int n) {
        // boolean ans = true;

        if (n == (a.length - 1)) {
            // ans = true;
            System.out.println("sorted");

        } else if (a[n] < a[n + 1]) {
            isSorted(a, n + 1);
        } else {
            System.out.println("not sorted");
            // ans = false;
        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 3, 4, 5 };
        isSorted(a, 0);
    }
}
