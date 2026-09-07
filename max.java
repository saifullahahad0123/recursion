public class max {

    static int findMax(int[] arr, int index) {

        // Base case
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Find maximum in remaining array
        int max = findMax(arr, index + 1);

        // Compare current element with remaining maximum
        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 45, 15};

        int ans = findMax(arr, 0);

        System.out.println("Maximum = " + ans);
    }
}
