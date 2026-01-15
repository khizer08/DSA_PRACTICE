public class seventh{

    public static void triangle(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}