public class _11_TheWhileLoopChallenge {
    public static void main(String[] args) {
        int initialNumber = 5;
        int evenCounter = 0;
        int oddCounter = 0;
        while (initialNumber <= 20){
            if(evenCounter >= 5){
                break;
            }

            if(isEvenNumber(initialNumber)){
                evenCounter++;
                System.out.println(initialNumber + " is even");
            } else {
                oddCounter++;
            }

            initialNumber++;

        }
        System.out.println("Odd counter: " + oddCounter);
        System.out.println("Even counter: " + evenCounter);
    }
        public static boolean isEvenNumber(int number) {
            return number % 2 == 0;
        }


}
