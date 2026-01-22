public class ninteen{
    public static void ovel_hole(int n){
        int k=-1;
        // first half
        //number of lines
        for(int i=n;i>=1;i--){
            //initial stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //center spaces
            k++;
            for(int j=1;j<=(2*k);j++){
                System.out.print(" ");
            }
            //final stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // second half
        //number of lines
        for(int i=1;i<=n;i++){
            //initial stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //center spaces
            for(int j=1;j<=(2*k);j++){
                System.out.print(" ");
            }
            k--;
            //final stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ovel_hole(5);
    }
}

// output:-
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********