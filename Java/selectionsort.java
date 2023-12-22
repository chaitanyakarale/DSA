 public class selectionsort {

      public static void ssort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }


 public static void main(String[] args) {

        int a[] = { 5, 4, 2, 3, 2 };
        ssort(a);
        System.out.print("Sorted Array->");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
