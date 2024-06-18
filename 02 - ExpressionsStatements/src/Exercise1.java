public class Exercise1 {
    // PositiveNegativeZero
    /*
        Write a method called checkNumber with an int parameter named number.
        The method should not return any value, and it needs to print out:

            - "positive" if the parameter number is > 0
            - "negative" if the parameter number is < 0
            - "zero" if the parameter number is equal to 0
    */
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
    }

    public static void checkNumber(int number){

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
