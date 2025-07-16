import java.util.ArrayList;
import java.util.Scanner;

public class Multipaction {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input1 = sc.nextLine().split(" ");
            String[] input2 = sc.nextLine().split(" ");
            int numOccurences = 0;
            ArrayList<Integer> occureneceIdxArr = new ArrayList<>();
            for (int idx = 0; idx < input1.length; idx++) {
                double elem1 = Double.parseDouble(input1[idx]);
                double elem2 = Double.parseDouble(input2[idx]);
                if (elem1 >= 0.600 && elem1 <= 0.850 && elem2 >= 0.600 && elem2 <= 0.850) {
                    numOccurences++;
                    occureneceIdxArr.add(idx);
                }

            }
            if (numOccurences == 0) {
                answer += "No multipaction events detected.";
            } else if (numOccurences == 1) {
                answer += "A multipaction event was detected at time index " + occureneceIdxArr.get(0) + ".";
            } else {
                answer += numOccurences + " multipaction events were detected at time indices:";
                for (Integer idx : occureneceIdxArr) {
                    answer += " " + idx;
                }
                answer += ".";
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }

        String testAnswer = "2 multipaction events were detected at time indices: 1 4.\n" + //
                "A multipaction event was detected at time index 5.\n" + //
                "No multipaction events detected.";
        String s1 = testAnswer;
        String s2 = answer;

        for (int l = 0; l < Math.min(s1.length(), s2.length()); l++) {
            if (s1.charAt(l) != s2.charAt(l)) {
                // System.out.println("Difference at index " + l + ": " + s1.charAt(l) + " vs "
                // + s2.charAt(l));
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
