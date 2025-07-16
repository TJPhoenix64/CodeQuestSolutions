import java.util.ArrayList;
import java.util.Scanner;

public class PenniesAddUp {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            int valOfA = Integer.parseInt(inputArr[0]);
            int numWords = Integer.parseInt(inputArr[1]);
            ArrayList<String> winners = new ArrayList<>();
            for (int j = 0; j < numWords; j++) {
                String input = sc.nextLine();
                int total = 0;
                for (int idx = 0; idx < input.length(); idx++) {
                    char elem = input.charAt(idx);
                    int num = ((elem - 'A') + valOfA) % 26;
                    total += num;
                }
                if (total == 100) {
                    winners.add(input);
                }
            }
            for (int idx = 0; idx < winners.size(); idx++) {
                String word = winners.get(idx);
                answer.append("WINNER ").append(valOfA).append(": ").append(word);
                if (idx + 1 != winners.size()) {
                    answer.append("\n");
                }

            }

            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
