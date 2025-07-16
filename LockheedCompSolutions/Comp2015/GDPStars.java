import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class GDPStars {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            String country = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            ArrayList<Integer> years = new ArrayList<>();
            HashMap<Integer, Integer> yearAndStarMap = new HashMap<>();
            for (int j = 0; j < num; j++) {
                String[] input = sc.nextLine().split(" ");
                double value = Double.parseDouble(input[0]);
                int year = Integer.parseInt(input[1]);
                years.add(year);
                int numStars = (int) ((value + 500) / 1000.0);
                yearAndStarMap.put(year, numStars);
            }
            answer.append(country).append(":\n");
            Collections.sort(years);
            for (int k = 0; k < years.size(); k++) {
                int year = years.get(k);
                answer.append(year).append(" ");
                for (int j = 0; j < yearAndStarMap.get(year); j++) {
                    answer.append("*");
                }

                if (k + 1 != years.size()) {
                    answer.append("\n");

                }
            }

            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        answer.trimToSize();
        System.out.println(answer);
        sc.close();
    }
}
