public class sum {
    public static void main(String[] args) {
        System.out.print(add(10));
    }
    public static int add(int n){
        if (n ==1 ) return 1;
        return n+ add(n-1);
   }
}
