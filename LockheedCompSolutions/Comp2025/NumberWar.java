import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumberWar {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            int num3 = Integer.parseInt(input[2]);
            Integer[] player1Arr = { num1, num2, num3 };
            int num4 = Integer.parseInt(input[3]);
            int num5 = Integer.parseInt(input[4]);
            int num6 = Integer.parseInt(input[5]);
            Integer[] player2Arr = { num4, num5, num6 };

            Arrays.sort(player1Arr, Collections.reverseOrder());
            Arrays.sort(player2Arr, Collections.reverseOrder());

            int oneTotal = (player1Arr[0] * 10) + player1Arr[1];
            int twoTotal = (player2Arr[0] * 10) + player2Arr[1];
            // answer += oneTotal + " " + twoTotal;

            if (oneTotal > twoTotal) {
                answer += "PLAYER 1";
            } else if (twoTotal > oneTotal) {
                answer += "PLAYER 2";
            } else {
                answer += "WAR!";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
