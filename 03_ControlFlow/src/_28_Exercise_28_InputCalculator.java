import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _28_Exercise_28_InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        boolean isInt = true;
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {

            try {
                int input = Integer.parseInt(scanner.nextLine());
                sum += input;
                numbers.add(input);
            } catch (NumberFormatException e) {
                isInt = false;
                System.out.println("SUM = " + sum + " AVG = " + Math.round((float) sum / numbers.size()));
            }

        } while (isInt);
    }


}
