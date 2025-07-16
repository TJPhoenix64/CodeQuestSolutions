import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//DONE
public class Problem_13 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDays = sc.nextInt();
        sc.nextLine();
        String answer = "";
        int totalEvents = 0;
        int currentEvent = 0;
        for (int i = 0; i < numDays; i++) {
            int numTasks = sc.nextInt();
            totalEvents += numTasks;
            sc.nextLine();
            HashMap<String, Double> eventMap = new HashMap<>();
            String input = "";
            String activityName;
            String prevActivityName = "";
            int startTimeMins = 0;
            while (!input.contains("End Day")) {
                input = sc.nextLine();
                int indexOfPipe = input.indexOf("|");
                String endTime = input.substring(indexOfPipe + 1);
                String endHour = endTime.substring(0, 2);
                String endMins = endTime.substring(2);
                // System.out.println("StartTimeMins: " + startTimeMins);

                int endTimeMins = Integer.parseInt(endHour) * 60 + Integer.parseInt(endMins);
                activityName = input.substring(0, indexOfPipe);
                // System.out.println("StartTime: " + startTimeMins + "EndTime: " +
                // endTimeMins);
                if (startTimeMins != 0) {
                    int duration = endTimeMins - startTimeMins;
                    // System.out.println("Duration: " + duration);
                    eventMap.put(prevActivityName, duration + eventMap.getOrDefault(prevActivityName, 0.0));
                    // answer += prevActivityName + " " + duration + "\n";
                }
                startTimeMins = endTimeMins;
                // answer += startTimeMins / 60.0 + " " + startTimeMins + "\n";
                // System.out.println("StartTime: " + startTimeMins);
                prevActivityName = activityName;
            }

            List<String> myList = new ArrayList<>();
            for (String keys : eventMap.keySet()) {
                myList.add(keys);
            }
            Collections.sort(myList);
            for (String keys : eventMap.keySet()) {
                Double rounded = ((int) (eventMap.get(keys) / 6)) / 10.0;
                eventMap.put(keys, rounded);
            }
            for (String keys : myList) {
                answer += keys + "-" + eventMap.get(keys);
                currentEvent++;
                if (currentEvent != totalEvents || i < numTasks - 1) {
                    answer += "\n";
                }
            }
            // System.out.println(eventMap);
        }
        System.out.println(answer);
        sc.close();
    }
}
