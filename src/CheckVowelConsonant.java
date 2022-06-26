import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        System.out.println("Vowel or Consonant");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Alphabet for check : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
