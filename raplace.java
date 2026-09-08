public class raplace {

    static String replaceChar(String str, int index, char oldChar, char newChar) {

        // Base case
        if (index == str.length()) {
            return "";
        }

        char ch = str.charAt(index);

        // If character matches, replace it
        if (ch == oldChar) {
            ch = newChar;
        }

        // Recursive call
        return ch + replaceChar(str, index + 1, oldChar, newChar);
    }

    public static void main(String[] args) {

        String str = "banana";

        String ans = replaceChar(str, 0, 'a', 'x');

        System.out.println(ans);
    }
}
