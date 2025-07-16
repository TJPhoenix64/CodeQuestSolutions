import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pennies {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        for (int i = 0; i < numCases; i++) {
            int num = Integer.parseInt(sc.nextLine());
            BigDecimal totalDifference = BigDecimal.ZERO;
            for (int j = 0; j < num; j++) {
                BigDecimal price = new BigDecimal(sc.nextLine());
                int charge = (int) Math.ceil(price.doubleValue());

                BigDecimal diff = BigDecimal.valueOf(charge).subtract(price);
                totalDifference = totalDifference.add(diff);

                answer.append(charge).append("\n");
            }
            answer.append(df.format(totalDifference));
            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        // System.out.println(df.getRoundingMode());
        System.out.println(answer);
        sc.close();
    }
}