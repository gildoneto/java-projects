import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise6 {
    //Decimal Comparator
    /*
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        The method should return boolean, and it needs to return true if two double numbers
        are the same up to three decimal places. Otherwise, return false.

        EXAMPLES OF INPUT/OUTPUT:

        areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
        areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
        areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
        areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
      */

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long number1 = (long) (num1 * 1000);
        long number2 = (long) (num2 * 1000);
        return number1 == number2;
    }
}
