import java.util.LinkedHashMap;
import java.util.Scanner;

public class Files {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        LinkedHashMap<String, Integer> endingMap = new LinkedHashMap<>();
        for (int i = 0; i < numCases; i++) {
            String[] a = sc.nextLine().split("\\.");
            String ending = a[1];

            endingMap.put(ending, endingMap.getOrDefault(ending, 0) + 1);
        }
        for (String ending : endingMap.keySet()) {
            answer += ending + " " + endingMap.get(ending) + "\n";
        }
        System.out.println(answer.trim());
        sc.close();
    }
}