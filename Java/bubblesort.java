 public class bubblesort {

    public static void bsort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
    }

 public static void main(String[] args) {

        int a[] = { 5, 4, 2, 3, 2 };
        bsort(a);
        System.out.print("Sorted Array->");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
