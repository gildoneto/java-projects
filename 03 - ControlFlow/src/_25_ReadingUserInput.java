import java.time.LocalDate;
import java.util.Scanner;

public class _25_ReadingUserInput {
    public static void main(String[] args) {

        int currentYear = LocalDate.now().getYear();

        try {
            System.out.println(getInputFromScanner(currentYear));
        } catch (NullPointerException e) {

        }



    }

    /**
     * This method is working in IDEs like IntelliJ IDEA, Eclipse, etc.
     * @param currentYear
     * @return
     */
    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for being here!");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed !!! Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old!";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return currentYear - dob;
    }

    // This method is not working in IDEs like IntelliJ IDEA, just in the console
    /*
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thanks for being here!");

        String yearOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(yearOfBirth);
        return "So you are " + age + " years old!";
    }
    */

}
