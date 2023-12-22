
public class roundsearch {

    public static int search(int a[], int tar, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;
        if (a[mid] == tar) {
            return mid;
        }
        if (a[si] <= a[mid]) {
            if (a[si] <= tar && tar <= a[mid]) {
                return search(a, tar, si, mid - 1);
            }

            else {
                return search(a, tar, mid + 1, ei);
            }
        } else {
            if (a[ei] >= tar && tar >= a[mid]) {
                return search(a, tar, mid + 1, ei);
            }

            else {
                return search(a, tar, si, mid);
            }

        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(a, 6, 0, a.length - 1));

    }
}
