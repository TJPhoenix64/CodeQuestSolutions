import java.util.Scanner;

public class Books {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] strArr = input.split("");
            int total = 0;
            int checkNum = 10;
            for (int idx = 0; idx < 9; idx++) {
                int num = Integer.parseInt(strArr[idx]);
                total += num * (10 - idx);
            }
            if (!strArr[9].equals("X")) {
                checkNum = Integer.parseInt(strArr[9]);
            }

            if ((total + checkNum) % 11 == 0) {
                answer += "VALID";
            } else {
                answer += "INVALID";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
