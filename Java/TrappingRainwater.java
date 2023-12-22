public class TrapingRainwater {

    public static int trapped(int a[]) {
        int n = a.length;
        int leftmax[] = new int[a.length];
        int rightmax[] = new int[a.length];

        leftmax[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(a[i], leftmax[i - 1]);
        }

        rightmax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(a[i], rightmax[i + 1]);
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += waterLevel - a[i];

        }
        return trappedwater;

    }

    public static void main(String[] args) {

        int a[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapped(a));

    }
}
