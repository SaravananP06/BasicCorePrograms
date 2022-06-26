import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("Power of 2 program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number between 0 and 31 : ");
        int num = sc.nextInt();

        //Simple for loop to print out all the power values of two
        if (0 <= num && num <= 31){
            for (int i = 0; i <= num; i++){
                System.out.println("2^" +i + "=" +Math.pow(2,i) );
            }
        }

    }
}
