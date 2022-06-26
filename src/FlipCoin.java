import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("We are going to flip the coin");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time do you want to flip a coin?: ");
        int num = sc.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i=0; i<num; i++) {
            double coin = Math.floor(Math.random() * 10) % 2;
            if (coin == 1) {
                heads = heads + 1;
                System.out.println("heads");
            } else {
                tails = tails + 1;
                System.out.println("Tails");
            }
        }

        double headsPercentage = (double) heads / num * 100;
        double tailsPercentage = (double) tails / num * 100;
        System.out.println("The percentage of head is: " +headsPercentage);
        System.out.println("The percentage of head is: " +tailsPercentage);

    }
}
