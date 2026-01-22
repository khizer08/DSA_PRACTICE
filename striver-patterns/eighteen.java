public class eighteen{
    public static void reverse_alphabet_print_triangle(int n){
        char ch=(char)('A'+(n-2));
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                ch++;
                System.out.print(ch+" ");
            }
            for(int j=1;j<=i+1;j++){
                ch--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverse_alphabet_print_triangle(5);
    }
}

// output:-
// E 
// D E
// C D E
// B C D E
// A B C D E