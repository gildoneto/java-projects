public class Exercise11 {
    // Equality Printer
    /*
        Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
        If one of the parameters is less than 0, print text "Invalid Value".
        If all numbers are equal print text "All numbers are equal"
        If all numbers are different print text "All numbers are different".
        Otherwise, print "Neither all are equal or different".

        EXAMPLES OF INPUT/OUTPUT:

        printEqual(1, 1, 1); should print text All numbers are equal
        printEqual(1, 1, 2); should print text Neither all are equal or different
        printEqual(-1, -1, -1); should print text Invalid Value
        printEqual(1, 2, 3); should print text All numbers are different
    */

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(2,1,1);
    }

    public static void printEqual(int firstInt, int secondInt, int thirdInt) {

        if(firstInt < 0 || secondInt < 0 || thirdInt < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (firstInt == secondInt && firstInt == thirdInt) {
            System.out.println("All numbers are equal");
        } else if (firstInt != secondInt && firstInt != thirdInt && secondInt != thirdInt) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
