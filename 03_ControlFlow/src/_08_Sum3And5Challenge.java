public class _08_Sum3And5Challenge {
    public static void main(String[] args) {

        int accumulator = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){

                accumulator++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");
                if(accumulator == 5){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        System.out.println("Sum of the numbers divisible by 3 and 5 is " + sum);
    }
}
