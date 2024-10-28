public class _07_ThePrimeNumberChallenge {
    public static void main(String[] args) {

        int count = 0;
        int initialCount = 10;
        int finalCount = 50;

        for (int i = initialCount; i <= finalCount; i++){
            if (isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count++;
//                if (count == 3) {
//                    System.out.println("Found 3 - Exiting for loop");
//                    break;
//                }
            }
        }
        System.out.println("Total number of prime numbers between " + initialCount + " and " + finalCount + " is " + count);
    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
