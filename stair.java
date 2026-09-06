import java.util.*;

public class stair {

    static int stairs(int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

    
        return stairs(n - 1) + stairs(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        System.out.println("Number of ways = " + stairs(n));
    }
}