public class _14_Exercise_17_FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0 ) return -1;

        String textNumber = Integer.toString(number);
        char firstChar = textNumber.charAt(0);
        char lastChar = textNumber.charAt(textNumber.length() - 1);

        int firstNumber = Character.getNumericValue(firstChar);
        int lastNumber = Character.getNumericValue(lastChar);

        return firstNumber + lastNumber;
    }

}
