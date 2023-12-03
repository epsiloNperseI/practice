package codewars;

import java.util.*;

public class TimeFormatter {

    public static void main(String[] args) {
        System.out.println(formatDuration(3600));
    }

    public static String formatDuration(int timeInSecs) {

        int seconds = timeInSecs%60;
        int minutes = timeInSecs%3600/60;
        int hours = timeInSecs%86400/3600;
        int days = timeInSecs%31104000/86400;
        int year = timeInSecs/31104000;


        String yearsStr = year > 0 ? year + (year > 1 ? " years" : " year") : "";

        String befDaysString = yearsStr.equals("") ? "" : getActivePeriod(days, hours, minutes, seconds) == 1 ? " and " : "  ,";
        String daysStr = days > 0 ? days + (days > 1 ? " days" : " day") : "";

        String befHoursString = yearsStr.equals("") && daysStr.equals("") ? "" : getActivePeriod(0, hours, minutes, seconds) == 1 ? " and " : "  ,";
        String hoursStr = hours > 0 ? hours + (hours > 1 ? " hours" : " hour") : "";

        String befMinuteString = yearsStr.equals("") && daysStr.equals("") && hoursStr.equals("") ? "" : getActivePeriod(0, 0, minutes, seconds) == 1 ? " and " : "  ,";
        String minutesStr = minutes > 0 ? minutes + (minutes > 1 ? " minutes" : " minute") : "";
        boolean noOnlySecs = yearsStr.equals("") && daysStr.equals("")
                && hoursStr.equals("") && minutesStr.equals("");

        String beforeSecsStr = noOnlySecs || seconds <= 0 ? "" : " and ";

        String secondsStr = seconds > 0 ? seconds + (seconds > 1 ? " seconds" : " second") : "";

        return yearsStr + befDaysString +
                daysStr + befHoursString +
                hoursStr + befMinuteString +
                minutesStr + beforeSecsStr + secondsStr;
    }

    private static int getActivePeriod(int f, int g, int h, int y) {
        int contOfNotZero = 0;

        if (f > 0) {
            contOfNotZero++;
        }
        if (g > 0) {
            contOfNotZero++;
        }
        if (h > 0) {
            contOfNotZero++;
        }
        if (y > 0) {
            contOfNotZero++;
        }

        return contOfNotZero;
    }

}
