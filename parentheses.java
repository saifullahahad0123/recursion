import java.util.*;

public class parentheses {

    public static void generate(int n, int open, int close, String str) {

    
        if (str.length() == 2 * n) {
            System.out.println(str);
            return;
        }

      
        if (open < n) {
            generate(n, open + 1, close, str + "(");
        }

        
        if (close < open) {
            generate(n, open, close + 1, str + ")");
        }
    }

    public static void main(String[] args) {

        int n = 3;

        generate(n, 0, 0, "");
    }
}

