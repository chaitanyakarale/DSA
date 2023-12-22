public class countingsort {

    public static void sort(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 1, 3, 2 };
        sort(a);
        System.out.print("Sorted Array->");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
