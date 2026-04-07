class Main {
    public static void main(String args[]){
        Pattern25(5);
    }
    static void Pattern25(int n){
        for(int rows=1;rows<2*n;rows++){
            int stars=0;
            int spaces=0;
            if(rows<=n){
                stars=rows;
            }else{
                stars=2*n-rows;
            }
            spaces=n-stars;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=stars;col++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}