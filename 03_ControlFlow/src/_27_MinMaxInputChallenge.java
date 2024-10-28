import java.util.Scanner;

public class _27_MinMaxInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = 0;
        int input = 0;
        int loopCounter = 0;
        boolean enteredNumber = true;

        do {
            System.out.println("Enter a number or any character to quit");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Min number: " + minNumber);
                System.out.println("Max number: " + maxNumber);
                enteredNumber = false;
            }
            loopCounter++;
            if (loopCounter == 1) {
                minNumber = input;
            } else {
                minNumber = Math.min(input, minNumber);
            }
            maxNumber = Math.max(input, maxNumber);

        } while (enteredNumber);
    }

}
