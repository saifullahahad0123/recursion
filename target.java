public class target {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,8};
        System.out.print( tar(arr, 0 , 100));
    }
    public static boolean tar(int[] arr, int idx , int target  ){

        int n = arr.length;
        if(idx == n) return false;
        if(target == arr[idx]) return true;
      return tar(arr, idx+1, target);
    } 
}
