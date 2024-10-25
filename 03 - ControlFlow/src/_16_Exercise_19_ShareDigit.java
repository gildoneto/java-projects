import java.util.ArrayList;
import java.util.List;

public class _16_Exercise_19_ShareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10, 25));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) return false;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while (number1 > 9) {
            int firstDigit = number1 / 10;
            int secondDigit = number1 % 10;
            list1.add(firstDigit);
            list1.add(secondDigit);
            number1 = number1 / 10;
        }

        while (number2 > 9) {
            int firstDigit = number2 / 10;
            int secondDigit = number2 % 10;
            list2.add(firstDigit);
            list2.add(secondDigit);
            number2 = number2 / 10;
        }

        for (Integer integer : list1) {
            if (list2.contains(integer)) {
                return true;
            }
        }

        return false;
    }

}
