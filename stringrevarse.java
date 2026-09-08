public class stringrevarse {

    static void reverse(String str, int index) {

        // Base case
        if (index == str.length()) {
            return;
        }

        // Recursive call
        reverse(str, index + 1);

        // Print while returning
        System.out.print(str.charAt(index));
    }

    public static void main(String[] args) {

        String str = "hello";

        reverse(str, 0);
    }
}
