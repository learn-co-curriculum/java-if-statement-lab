import java.util.InputMismatchException;
import java.util.Scanner;

public class BuggyLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer number
        System.out.println("Please enter an integer:");

        try {
            int userNumber = scanner.nextInt();

            // Determine if the number entered was odd or even
            // Remember, if the number is even, then userNumber % 2 will result in a 0
            if (userNumber % 2 == 0) {
                System.out.println("The number, " + userNumber + ", is even!");

                if (userNumber % 2 == 1) {
                    System.out.println("The number, " + userNumber + ", is odd!");
                }
            }

        } catch (InputMismatchException exception) {
            System.err.println("The input entered was not a valid number.");
        }
    }
}
