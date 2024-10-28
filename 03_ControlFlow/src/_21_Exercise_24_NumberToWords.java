public class _21_Exercise_24_NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");

        int reversed = reverse(number);
        StringBuilder numberText = new StringBuilder();

        for (int i = 0; i < getDigitCount(number); i++) {
            char c = String.valueOf(number).charAt(i);
            switch (String.valueOf(c)) {
                case "0":
                    numberText.append("Zero ");
                    break;
                case "1":
                    numberText.append("One ");
                    break;
                case "2":
                    numberText.append("Two ");
                    break;
                case "3":
                    numberText.append("Three ");
                    break;
                case "4":
                    numberText.append("Four ");
                    break;
                case "5":
                    numberText.append("Five ");
                    break;
                case "6":
                    numberText.append("Six ");
                    break;
                case "7":
                    numberText.append("Seven ");
                    break;
                case "8":
                    numberText.append("Eight ");
                    break;
                case "9":
                    numberText.append("Nine ");
                    break;
            }

        }

        System.out.println(numberText.toString().trim());
    }

    public static int reverse(int number) {
        String textNumber = "";

        for(int i = String.valueOf(number).length(); i > 0; i--){
            char c = String.valueOf(number).charAt(i - 1);
            textNumber += c;
        }

        if(number < 0){
            textNumber = textNumber.replaceAll("-", "");
            return Math.negateExact(Integer.parseInt(textNumber));
        } else {
            return Integer.parseInt(textNumber);
        }

    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        return String.valueOf(number).length();
    }


}
