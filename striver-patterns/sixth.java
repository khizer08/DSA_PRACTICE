public class sixth{

    public static void reverseRightAngledNum(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverseRightAngledNum(5);
    }
}