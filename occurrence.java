import java.util.*;

public class occurrence {

    static int helper(int[] arr, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

       
        if (arr[mid] == target) {

            int left = helper(arr, target, low, mid - 1);

           
            if (left != -1) {
                return left;
            }

            return mid;
        }

        if (target > arr[mid]) {
            return helper(arr, target, mid + 1, high);
        }
        return helper(arr, target, low, mid - 1);
    }

    static int firstOccurrence(int[] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};

        int target = 2;

        int ans = firstOccurrence(arr, target);

        System.out.println("First occurrence = " + ans);
    }
}