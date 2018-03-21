import java.util.Scanner;
public class AlphabetorNot {

    public static void main(String[] args) {
        Scanner C=new Scanner(System.in);

        char c = C.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
