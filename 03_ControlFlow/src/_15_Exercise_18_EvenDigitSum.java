public class _15_Exercise_18_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0 ) return -1;

        String textNumber = Integer.toString(number);
        int evenSum = 0;

        for (int i = 0; i < textNumber.length(); i++) {
            char c = textNumber.charAt(i);
            int digit = Character.getNumericValue(c);
            if (digit % 2 == 0) {
                evenSum += digit;
            }
        }

        return evenSum;
    }

}
