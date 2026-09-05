import java.util.*;

public class reverse {

    static int rev(int n, int rev) {

     
        if (n == 0) {
            return rev;
        }

     
        int digit = n % 10;

      
        rev = rev * 10 + digit;

        
        return rev(n / 10, rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int ans = rev(n, 0);

        System.out.println("Reverse = " + ans);
    }
}