public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + inchesToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + inchesToCentimeters(68) + "cm");
    }
    public static final double INCHES_IN_CENTIMETER = 2.54;
    public static final int FEET_IN_INCHES = 12;
    public static double inchesToCentimeters(int heightInInches) {
        if (heightInInches < 0) {
            return -1;
        }
        return heightInInches * INCHES_IN_CENTIMETER;
    }

    public static double inchesToCentimeters(int heightInFeet, int remainingHeightInInches) {
        // return inchesToCentimeters((heightInFeet * FEET_IN_INCHES) + remainingHeightInInches);
        int feetToInches = heightInFeet * FEET_IN_INCHES;
        int totalInches = feetToInches + remainingHeightInInches;
        double result = inchesToCentimeters(totalInches);
        return result;
    }
}
