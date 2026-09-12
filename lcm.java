public class lcm {

    public static void main(String[] args) {

        int a = 22;
        int b = 11;

        int gcd = gcd(a, b);

        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }
}
