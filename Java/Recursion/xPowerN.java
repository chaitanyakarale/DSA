

public class xpowern {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;

        }
        return x * power(x, n - 1);

    }

    public static int optpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optpower(x, n / 2);
        int halfpowersq = halfpower * halfpower;
        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args) {
        System.out.println(optpower(5, 10));

    }
}
