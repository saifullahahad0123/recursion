public class combination{
    static void combinations(String str, int index, String ans) {

        // Base case
        if (index == str.length()) {

            if (ans.length() > 0) {
                System.out.println(ans);
            }

            return;
        }

        // Include current character
        combinations(str, index + 1, ans + str.charAt(index));

        // Don't include current character
        combinations(str, index + 1, ans);
    }

    public static void main(String[] args) {

        String str = "abc";

        combinations(str, 0, "");
    }
}