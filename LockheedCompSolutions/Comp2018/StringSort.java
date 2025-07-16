import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSort {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            stringList.add(input);
        }
        Collections.sort(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            answer += stringList.get(i);
            if (i + 1 != stringList.size()) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}