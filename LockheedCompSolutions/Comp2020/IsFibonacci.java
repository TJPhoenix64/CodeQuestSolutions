import java.util.Scanner;

public class IsFibonacci {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int targetNum = Integer.parseInt(sc.nextLine());
            int num = 1;
            int previousNum = 0;

            boolean isFib = false;
            String t = "TRUE";
            String f = "FALSE";
            if (num == 1 || num == 0) {
                answer += t;
            } else {
                while (num < targetNum) {
                    num = previousNum + num;
                    previousNum = num - previousNum;
                    if (num == targetNum) {
                        isFib = true;
                    }
                }
                if (isFib) {
                    answer += t;
                } else {
                    answer += f;
                }
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
