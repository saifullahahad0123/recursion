public class practice{
    public static void main(String[] args) {
        saif(1);
    }
    public static void saif(int n){
        if (n == 10) return ; 
        System.err.println("saifullah");
        saif(n+1);
    }
}