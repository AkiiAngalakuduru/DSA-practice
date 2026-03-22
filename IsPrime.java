import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean ans=IsPrime(n);
        System.out.println(ans);
    }
    static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
        c++;
        }
        return true;
    }
}