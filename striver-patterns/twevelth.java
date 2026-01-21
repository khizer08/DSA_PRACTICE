public class twevelth{
    public static void v_number_space(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        v_number_space(5);
    }
}

// output:-
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

git add twevelth
git commit -m "v_number_space"
git push origin main