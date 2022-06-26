import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Finding Largest Number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Please Enter Number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Please Enter Number 3 : ");
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("The largest number is: " +num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}
