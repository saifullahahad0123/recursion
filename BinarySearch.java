import java.util.*;

public class BinarySearch {

    
    static int helper(int[] arr, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return helper(arr, target, mid + 1, high);
        }

        return helper(arr, target, low, mid - 1);
    }

  
    static int binarySearch(int[] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 60;

        int ans = binarySearch(arr, target);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }
}