import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Asteroid {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numGroups = Integer.parseInt(sc.nextLine());
            Map<Integer, Double> map = new HashMap<>();
            HashMap<Integer, String> inputMap = new HashMap<>();
            for (int j = 0; j < numGroups; j++) {
                String input = sc.nextLine();
                String[] inputArr = input.split(" ");
                int x = Integer.parseInt(inputArr[0]);
                int y = Integer.parseInt(inputArr[1]);
                double distance = Math.sqrt(x * x + y * y);
                map.put(j, distance);
                inputMap.put(j, input);
            }

            ArrayList<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());
            for (Map.Entry<Integer, Double> elem : list) {
                answer += inputMap.get(elem.getKey());
                if (!elem.equals(list.get(list.size() - 1))) {
                    answer += "\n";
                }
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
