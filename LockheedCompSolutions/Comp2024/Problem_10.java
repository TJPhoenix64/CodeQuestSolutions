import java.text.DecimalFormat;
import java.time.*;
import java.util.Scanner;

//DONE
public class Problem_10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        DecimalFormat df = new DecimalFormat("00");
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String date2 = input.substring(20);
            int Month = Integer.parseInt(input.substring(0, 2));
            int Day = Integer.parseInt(input.substring(3, 5));
            int Year = Integer.parseInt(input.substring(6, 10));
            int Hour = Integer.parseInt(input.substring(11, 13));
            int Minute = Integer.parseInt(input.substring(14, 16));
            int Second = Integer.parseInt(input.substring(17, 19));

            int Month2 = Integer.parseInt(date2.substring(0, 2));
            int Day2 = Integer.parseInt(date2.substring(3, 5));
            int Year2 = Integer.parseInt(date2.substring(6, 10));
            int Hour2 = Integer.parseInt(date2.substring(11, 13));
            int Minute2 = Integer.parseInt(date2.substring(14, 16));
            int Second2 = Integer.parseInt(date2.substring(17, 19));

            LocalDateTime dateTimeBefore = LocalDateTime.of(Year, Month, Day, Hour, Minute, Second);
            LocalDateTime dateTimeAfter = LocalDateTime.of(Year2, Month2, Day2, Hour2, Minute2, Second2);

            Duration duration = Duration.between(dateTimeBefore, dateTimeAfter);

            String days = df.format(duration.toDays());
            String hours = df.format(duration.toHours() % 24);
            String minutes = df.format(duration.toMinutes() % 60);
            String seconds = df.format(duration.getSeconds() % 60);

            String dayString = days + " Day";
            if (!days.equals("01")) {
                dayString += "s";
            }

            String hourString = " " + hours + " Hour";
            if (!hours.equals("01")) {
                hourString += "s";
            }

            String minuteString = " " + minutes + " Minute";
            if (!minutes.equals("01")) {
                minuteString += "s";
            }

            String secondString = " " + seconds + " Second";
            if (!seconds.equals("01")) {
                secondString += "s";
            }
            if (i != 0) {
                answer += "\n";
            }

            answer += dayString + hourString + minuteString + secondString;
        }
        System.out.println(answer);
        sc.close();
    }
}
