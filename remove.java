public class remove {

    static String removeDuplicates(String str, int index) {

     
        if (index == str.length()) {
            return "";
        }

       
        if (index < str.length() - 1 &&
            str.charAt(index) == str.charAt(index + 1)) {

            return removeDuplicates(str, index + 1);
        }

       
        return str.charAt(index) +
               removeDuplicates(str, index + 1);
    }

    public static void main(String[] args) {

        String str = "aaabbccdaa";

        String ans = removeDuplicates(str, 0);

        System.out.println(ans);
    }
}
