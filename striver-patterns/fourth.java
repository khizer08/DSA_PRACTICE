public class fourth{

    public static void ContinousRightAngledNumPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ContinousRightAngledNumPattern(5);
    }
}

// output:-
// 1
// 22
// 333
// 4444
// 55555