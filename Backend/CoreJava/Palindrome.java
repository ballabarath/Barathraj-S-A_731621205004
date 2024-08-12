import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = ""; // Initialize reverse to an empty string

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        original = sc.nextLine();

        // Reverse the string
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
