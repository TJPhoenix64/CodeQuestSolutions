import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyTips {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            double num = Double.parseDouble(input.substring(1));
            String num15 = df.format(num * 0.15);
            String num18 = df.format(num * 0.18);
            String num20 = df.format(num * 0.20);

            answer.append("Total of the bill: ").append(input).append("\n");
            answer.append("15% = $").append(num15).append("\n");
            answer.append("18% = $").append(num18).append("\n");
            answer.append("20% = $").append(num20);

            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
