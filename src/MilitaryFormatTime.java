import java.util.Scanner;
public class MilitaryFormatTime
{
    public static void main(String[] args) {
        final int MINUTES_IN_HOUR = 60;
        final int MINUTES_IN_DAY = 24 * 60;
        int firstTime;
        int firstTimeInMinutes;
        int secondTime;
        int secondTimeInMinutes;
        int minutes;
        int hours;
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the first time: ");
        firstTime = in.nextInt();
        firstTimeInMinutes = firstTime / 100 * MINUTES_IN_HOUR + firstTime % 100;
        System.out.print(" enter the second time: ");
        secondTime = in.nextInt();
        in.close();
        secondTimeInMinutes = secondTime / 100 * MINUTES_IN_HOUR + secondTime % 100;
        minutes = secondTimeInMinutes - firstTimeInMinutes;
        minutes = (MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY;
        hours = minutes / 60;
        minutes %= 60;
        System.out.printf("%d hours %d minutes", hours, minutes);
    }
}
