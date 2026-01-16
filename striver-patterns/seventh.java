public class seventh{

    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}