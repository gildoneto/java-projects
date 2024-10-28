import java.util.ArrayList;
import java.util.List;

public class _17_Exercise_20_LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(22, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(22, 23, 34));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        List<Integer> inputs = List.of(num1, num2, num3);
        List<Integer> numbers = new ArrayList<>();

        numbers.add(num1 % 10);

        for (int i = 1; i <= 2; i++) {
            if (numbers.contains(inputs.get(i) % 10)) {
                return true;
            }
            numbers.add(inputs.get(i) % 10);
        }

        return false;
    }

    public static boolean isValid(int num) {
        int minRange = 10;
        int maxRange = 1000;
        if (num < minRange || num > maxRange) {
            return false;
        } else {
            return true;
        }
    }

}
