import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Harmonic Number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number greater than zero : ");
        int num = sc.nextInt();

        double sum = 0;
        //compute 1/1 + 1/2 + 1/3 + ... + 1/N
        for (int i = 1; i <= num; i++) {
            sum = sum+ ((double)1 / i);
            System.out.println("The Harmonic number is: "+sum);
        }
    }
}
