public class Countdigits {

    static int count(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {

        int n = 12345;

        int ans = count(n);

        System.out.println("Number of digits = " + ans);
    }
}
