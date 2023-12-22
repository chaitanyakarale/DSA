public class binary {

    public static int binary(int a[], int key) {

        int start = 0;
        int end = a.length - 1;
        int index = 0;
        while (start <= end) {
            int mid = start + end / 2;

            if (a[mid] == key) {
                index = mid;
                break;

            } else if (key < a[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }

        return index;

    }

    public static void main(String args[]) {

        int a[] = { 1, 5, 9, 13, 34, 67, 94, 112, 115, 198, 245, 943 };
        int key = 676;

        System.out.println(binary(a, key));

    }

}
