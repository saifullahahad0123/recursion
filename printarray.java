public class printarray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printx(arr, 0);

    }
    public static void printx(int[] arr, int idx){
        int n = arr.length;
        if(idx == n) return ;
         System.out.print(arr[idx]+ " ");
       printx(arr, idx + 1);
    }
}