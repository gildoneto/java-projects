public class _13_Exercise_16_NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-707));
    }

    public static boolean isPalindrome(int number) {
        String textNumber = "";

        for(int i = String.valueOf(number).length(); i > 0; i--){
            char c = String.valueOf(number).charAt(i - 1);
            textNumber += c;
        }

        if(number < 0){
            textNumber = textNumber.replaceAll("-", "");
            return Math.negateExact(Integer.parseInt(textNumber)) == number;
        } else {
            return Integer.parseInt(textNumber) == number;
        }

    }
}
