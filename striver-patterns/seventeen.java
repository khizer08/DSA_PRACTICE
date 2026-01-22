public class seventeen{
    public static void triangle_alphabet(int n){
        char ch='A'-1;// understand
        // number of lines
        for(int i=1;i<=n;i++){
            //initial spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //core logic
            for(int j=1;j<=(2*i)-1;j++){
                if(j>i){
                    ch--;
                    System.out.print(ch);
                }else{
                    ch++;
                    System.out.print(ch);
                }
            }
            ch='A'-1;
            //end space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle_alphabet(4);
    }
}

// output:-
//    A   
//   ABA
//  ABCBA
// ABCDCBA