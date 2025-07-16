import java.util.Scanner;

public class EngineFailure {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            double low = Double.parseDouble(input[1]);
            double warning = Double.parseDouble(input[2]);
            double high = Double.parseDouble(input[3]);
            String[] temps = sc.nextLine().split(" ");
            double sum = 0.0;
            boolean needSum = true;
            boolean tooCool = false;
            boolean tooHot = false;
            for (String temp : temps) {
                double num = Double.parseDouble(temp);
                if (num < low) {
                    tooCool = true;
                } else if (num > high) {
                    tooHot = true;
                }
                sum += num;
            }
            if (tooCool) {
                answer += "TOO COOL";
            } else if (tooHot) {
                answer += "TOO HOT";
            } else if (needSum) {
                double average = sum / n;
                if (average > warning) {
                    answer += "WARNING";
                } else {
                    answer += "OK";
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
