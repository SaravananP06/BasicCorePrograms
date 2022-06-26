import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Factors: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number to check for prime factors: ");
        int num = sc.nextInt();

        System.out.println("Factors= 1 ");
        //Logic to print out prime factors for the given number
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i + " ");
                num = num / i;
            }
        }
        // For the number when after the loop and finding all the prime factors and to print the number itself as it also is a factor
        if (num > 1) {
            System.out.println(num);
        }
        System.out.println();;

    }



}
