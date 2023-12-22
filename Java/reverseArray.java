public class reverse {

    public static void reverse1(int a[]) {
        int first = 0;
        int last = a.length - 1;
        while (first <= last) {
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;

            first = first + 1;
            last = last - 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse1(a);
    }
}
