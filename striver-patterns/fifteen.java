public class fifteen{
    public static void reverse_alphabet_triangle(int n){
        char ch='A';// do remember "single quotes".
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch='A';
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverse_alphabet_triangle(5);
    }
}

// output:-
// ABCDE
// ABCD
// ABC
// AB
// A