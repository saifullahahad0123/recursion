public class sumDigit{

    static int sumDigits(int n) {

        
        if (n < 10) {
            return n;
        }

       
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println(sumDigits(n));
    }
}
