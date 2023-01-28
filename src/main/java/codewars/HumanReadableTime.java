package codewars;

public class HumanReadableTime {
    static int secondsInMinute = 60;
    static int minutesInHour = 60;

    // max seconds = 359999
    public static String makeReadable(int seconds) {
        int hours = 0;
        int minutes;
        int secondsFinal = 0;

        if (seconds % secondsInMinute != 0) {
            secondsFinal = seconds % 60;
            seconds = seconds - seconds % 60;
        }

        int preDefineMinutes = seconds / secondsInMinute;
        if (preDefineMinutes % minutesInHour != 0) {
            hours = (preDefineMinutes - (preDefineMinutes % minutesInHour)) / minutesInHour;
        } else if (preDefineMinutes % minutesInHour == 0) {
            hours = preDefineMinutes / minutesInHour;
        }

        minutes = preDefineMinutes % minutesInHour;

        return String.format("%02d:%02d:%02d",hours,minutes,secondsFinal);
    }

}
