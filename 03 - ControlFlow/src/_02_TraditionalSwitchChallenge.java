public class _02_TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char character = 'C';

        switch (character) {
            case 'A':
                System.out.println(character + " is Able");
                break;
            case 'B':
                System.out.println(character + " is Baker");
                break;
            case 'C':
                System.out.println(character + " is Charlie");
                break;
            case 'D':
                System.out.println(character + " is Dog");
                break;
            case 'E':
                System.out.println(character + " is Easy");
                break;
            default:
                System.out.println("Letter " + character + " was not found.");
                break;
        }
    }
}
