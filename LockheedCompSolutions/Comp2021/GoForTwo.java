import java.util.Scanner;

public class GoForTwo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        int[] twoDecisions = { -15, -13, -11, -10, -8, -5, -4, -2, 1, 5, 12 };
        for (int i = 0; i < numCases; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            int myScore = Integer.parseInt(inputArr[0]);
            int theirScore = Integer.parseInt(inputArr[1]);
            int difference = myScore - theirScore;
            boolean goForTwo = false;
            for (Integer elem : twoDecisions) {
                if (difference == elem) {
                    goForTwo = true;
                    break;
                }
            }
            if (goForTwo) {
                answer += "2";
            } else {
                answer += "1";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}