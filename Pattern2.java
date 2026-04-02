class Main {
    public static void main(String args[]){
     Pattern2(5);   
    }
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}