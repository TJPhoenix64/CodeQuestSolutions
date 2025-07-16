import static java.lang.Character.isDigit;
import java.util.ArrayList;
import java.util.Scanner;

public class Messages {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            ArrayList<Integer> nums = new ArrayList<>();
            String currentNum = "";
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (isDigit(c)) {
                    currentNum += c; // Keep building the number
                } else {
                    if (currentNum.isEmpty()) {
                    } else {
                        nums.add(Integer.valueOf(currentNum));
                        currentNum = "";
                    }
                }
            }
            if (!currentNum.isEmpty()) {
                nums.add(Integer.valueOf(currentNum));
            }
            for (Integer num : nums) {
                char letter = (char) ('a' + num - 1);
                answer += letter;
            }

            // answer += nums;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}