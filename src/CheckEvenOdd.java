import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.println("Even or Odd: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number to check for even/odd : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }

    }
}
