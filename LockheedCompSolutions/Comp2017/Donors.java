import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Donors {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input1 = sc.nextLine().split(",");
            String[] input2 = sc.nextLine().split(",");

            ArrayList<String> input1List = new ArrayList<>(Arrays.asList(input1));
            ArrayList<String> input2List = new ArrayList<>(Arrays.asList(input2));
            Collections.sort(input1List);
            Collections.sort(input2List);

            ArrayList<String> bothList = new ArrayList<>();
            ArrayList<String> lastList = new ArrayList<>();
            ArrayList<String> thisList = new ArrayList<>();

            for (String elem : input1List) {
                if (input2List.contains(elem)) {
                    bothList.add(elem);
                    input2List.remove(elem);
                } else {
                    lastList.add(elem);
                }
            }
            for (String elem : input2List) {
                thisList.add(elem);
            }
            answer += String.join(",", lastList) + "\n";
            answer += String.join(",", bothList) + "\n";
            answer += String.join(",", thisList);

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
