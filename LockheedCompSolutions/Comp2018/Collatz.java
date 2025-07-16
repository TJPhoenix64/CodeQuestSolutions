import java.util.Scanner;

public class Collatz {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int initalNum = Integer.parseInt(sc.nextLine());
            int num = initalNum;
            int numIterations = 1;
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num *= 3;
                    num += 1;
                }
                numIterations++;
            }
            answer += initalNum + ":" + numIterations;

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}