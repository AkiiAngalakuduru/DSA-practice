class Main {
    public static void main(String args[]){
    Pattern5(5);    
    }
    static void Pattern5(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }System.out.println();
        }
        for(int row=n-1;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}