import java.util.*;

public class UniquePath {

    static int paths(int i, int j, int m, int n) {

       
        if (i == m - 1 && j == n - 1) {
            return 1;
        }


        if (i >= m || j >= n) {
            return 0;
        }

        int down = paths(i + 1, j, m, n);

        int right = paths(i, j + 1, m, n);

        return down + right;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        System.out.println("Unique paths = " + paths(0, 0, m, n));
    }
}