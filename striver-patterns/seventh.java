public class seventh{

    public static void triangle(int n){

        // number of lines
        for(int i=1;i<=n;i++){
            //initial spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            //final spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}

// output:-
//     *    
//    ***
//   *****
//  *******
// *********