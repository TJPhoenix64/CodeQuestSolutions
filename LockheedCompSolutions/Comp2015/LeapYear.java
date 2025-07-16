import java.util.Scanner;

public class LeapYear {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numTests = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < numTests; j++) {
                int year = Integer.parseInt(sc.nextLine());
                boolean isLeapYear = false;
                if (year < 1582) {
                } else if (year % 4 != 0) {
                } else if (year % 100 != 0) {
                    isLeapYear = true;
                } else if (year % 400 != 0) {
                } else {
                    isLeapYear = true;
                }
                if (isLeapYear) {
                    answer += "Yes";
                } else {
                    answer += "No";
                }
                if (j + 1 != numTests) {
                    answer += "\n";
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
