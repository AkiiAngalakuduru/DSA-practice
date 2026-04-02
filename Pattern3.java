class Main {
    public static void main(String args[]){
      Pattern3(5);  
    }
    static void Pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n-row+1;col>0;col--){
                System.out.print("* ");
            }System.out.println();
        }
    }
}