public class fifth{
    
    public static void reverseRightAngled(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverseRightAngled(10);
    }
}