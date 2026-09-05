public class decinc {
    public static void main(String[] args) {
        inde(5);
    }
    public static void inde(int n){
        if(n==0) return ;
        System.out.println(n);
        inde(n-1);
        System.out.println(n);
    }
}

