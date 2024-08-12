import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit for the random number: ");
        int upperLimit = scanner.nextInt();

        Random rand = new Random();
        int randomNum = rand.nextInt(upperLimit);
        System.out.println("Random Number: " + randomNum);
    }
}
