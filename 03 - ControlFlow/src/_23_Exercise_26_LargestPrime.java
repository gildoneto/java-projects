public class _23_Exercise_26_LargestPrime {
    public static void main(String[] args) {
        System.out.println("Should be 7: " + getLargestPrime(21));
        System.out.println("Should be 31: " + getLargestPrime(217));
        System.out.println("Should be -1: " + getLargestPrime(0));
        System.out.println("Should be 5: " + getLargestPrime(45));
        System.out.println("Should be -1: " + getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int largestPrime = -1;

        // Divide number by 2 until it is odd
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Check for odd factors from 3 onwards
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // If number is still greater than 2, then it is prime
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;

    }


}
