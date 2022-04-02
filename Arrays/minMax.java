public class minMax {
    static pair getMinMax(long a[], long n) {
        long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if (n == 1) {
            max = a[0];
            min = a[0];
        }

        if (n == 2) {
            if (a[0] > a[1]) {
                max = a[0];
                min = a[1];
            } else {
                max = a[1];
                min = a[0];
            }
        }

        for (int i = 0; i <= n - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        return new pair(min, max);
    }
}
