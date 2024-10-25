public class _22_Exercise_25_FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println("----------------------------");
        System.out.println("FALSE: "+ canPack(1, 0, 6));
        System.out.println("FALSE: "+ canPack(0, 5, 6));
        System.out.println("FALSE: "+ canPack(2, 1, 12));
        System.out.println("TRUE: "+ canPack(2, 7, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int bigKilos = bigCount * 5;

        if(bigKilos + smallCount < goal) return false;
        if(bigKilos + smallCount == goal) return true;

        if(bigKilos > goal) {
            return smallCount >= goal % 5;
        } else {
            return smallCount >= goal - bigKilos;
        }
    }


}
