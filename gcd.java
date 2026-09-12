public class gcd {
    public static void main(String[] args) {
         System.out.print(hcf(22,22));
    }
    public static int hcf (int a , int b ){
        if (a == 0) return b;
       return   hcf(b%a,a);
    }
}
