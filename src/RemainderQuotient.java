import java.util.Scanner;

public class RemainderQuotient {
    public static void main(String[] args) {
        System.out.println("Compute Quotient and Remainder");

        //Taking in numeric inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the dividend : ");
        int dividend = sc.nextInt();

        System.out.println("Please Enter the divisor : ");
        int divisor = sc.nextInt();

        //Logic to calculate quotient and remainder
        int quotient = dividend/divisor;
        int remainder = dividend - (divisor * quotient);


        System.out.println("The quotient is : " + quotient);
        System.out.println("The remainder is : "+remainder);
    }
}
