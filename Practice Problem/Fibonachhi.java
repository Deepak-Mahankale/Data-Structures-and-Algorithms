public class Fibonachhi {
    public static void main(String[] args) {
        int k, a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 6; i++) {
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }
        /*
         * int k = 0, a = 1, b = 1;
         * System.out.print(k + " " + a + " " + " " + b + " ");
         * for (int i = 0; i <= 10; i++) {
         * k = a + b;
         * System.out.print(k + " ");
         * a = b;
         * b = k;
         * }
         */
    }
}
