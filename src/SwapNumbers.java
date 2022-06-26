import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Swap the numbers: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number n1 : ");
        int n1 = sc.nextInt();

        System.out.println("Please Enter number n2 : ");
        int n2 = sc.nextInt();

        System.out.println("Before swap the numbers are n1= " + n1 + " n2= " + n2);

        //Logic to swap the numbers without a third variable

        n1 = n1 * n2;

        n2 = n1 / n2;

        n1 = n1 / n2;

        System.out.println("After swap the numbers are n1= " + n1 + " n2= " + n2);

    }
}
