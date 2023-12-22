
public class mergesort {

    public static void mergesort(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(a, si, mid);
        mergesort(a, mid + 1, ei);

        merge(a, mid, si, ei);

    }

    public static void merge(int a[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;

            } else {
                temp[k] = a[j];
                j++;
            }

            k++;
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= ei) {
            temp[k++] = a[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            a[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int a[] = { 8, 3, 4, 1, 6, 3, 4 };
        mergesort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }
}
