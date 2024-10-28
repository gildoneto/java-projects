public class _20_Exercise_23_PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int acc = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                acc += i;
            }
        }

        return acc == number;
    }


}
