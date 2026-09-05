import java.util.*;
public class print1ton {

     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
     }
     public static void num(int n) {
        if(n==0) return ;
        System.out.println(n);
        num(n-1);
     }

}