public class _09_Exercise_15_SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int number){
        if (number > 0){
            if(number % 2 == 0){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){

        if(start > end || start <= 0){
            return -1;
        }
        int sum = 0;


        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }

        return sum;
    }
}
