public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString( -3945));
        System.out.println(getDurationString( -65, 45));
        System.out.println(getDurationString( 65, 145));
        System.out.println(getDurationString( 65, 45));
        System.out.println(getDurationString( 3945));
    }
    private static final int SECONDS_IN_MINUTE = 60;
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds: " + seconds;
        }
        int minutes = seconds / SECONDS_IN_MINUTE;
        int remainingSeconds = seconds % SECONDS_IN_MINUTE;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid data for minutes and/or seconds. Minutes: " + minutes + " Seconds: " + seconds;
        }
        int hours = minutes / SECONDS_IN_MINUTE;
        int remainingMinutes = minutes % SECONDS_IN_MINUTE;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
