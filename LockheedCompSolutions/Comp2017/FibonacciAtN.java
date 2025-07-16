import java.util.Scanner;

public class FibonacciAtN {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int N = Integer.parseInt(sc.nextLine());
            answer += N + " = ";
            int currentIteration = 4;
            long num = 2;
            long previousNum = 1;
            if (N == 1) {
                answer += 0;
            } else if (N == 2 || N == 3) {
                answer += 1;
            } else {
                while (currentIteration < N) {
                    num = previousNum + num;
                    previousNum = num - previousNum;
                    currentIteration++;
                }
                answer += num;
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer.trim());
        sc.close();
    }
}
