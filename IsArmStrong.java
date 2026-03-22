import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  number");
        int n=sc.nextInt();
        System.out.println(IsArmStrong(n));
    }
    static boolean IsArmStrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==original;
    }
}