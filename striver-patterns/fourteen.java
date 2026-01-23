public class fourteen{
    public static void alphabet_triangle(int n){
        char ch='A';// do remember "single quotes".
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch='A';
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphabet_triangle(5);
    }
}

// output:-
// A
// AB
// ABC
// ABCD
// ABCDE