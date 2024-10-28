import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _26_ReadingUserInputChallenge {
    public static void main(String[] args) {

        try {
            getNumbersFromInput();
        } catch (NullPointerException e) {

        }


    }

    public static void getNumbersFromInput() {

        Scanner scanner = new Scanner(System.in);

        int countValidNumbers = 1;
        int inputNumber = 0;
        List<Integer> numbers = new ArrayList<>();

        do {
            System.out.println("Enter number #" + countValidNumbers + " of 5: ");
            try {
                inputNumber = checkNumber(scanner.nextLine());
                numbers.add(inputNumber);
                countValidNumbers++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed !!! Try again.");
            }

        } while (countValidNumbers <= 5);

        System.out.println(numbers);;
    }

    public static int checkNumber(String inputNumber) {
        return Integer.parseInt(inputNumber);
    }



}
