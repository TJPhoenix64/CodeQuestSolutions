import java.text.DecimalFormat;
import java.util.Scanner;

public class Apollo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        double offset = 180.0;
        DecimalFormat df = new DecimalFormat("000.00");
        for (int i = 0; i < numCases; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            double num1 = Double.parseDouble(inputArr[0]);
            double num2 = Double.parseDouble(inputArr[1]);
            double num3 = Double.parseDouble(inputArr[2]);
            double changed1;
            double changed2;
            double changed3;
            if (num1 < offset) {
                changed1 = num1 + offset;
            } else {
                changed1 = num1 - offset;
            }
            if (num2 < offset) {
                changed2 = num2 + offset;
            } else {
                changed2 = num2 - offset;
            }
            if (num3 < offset) {
                changed3 = num3 + offset;
            } else {
                changed3 = num3 - offset;
            }
            String formatted1 = df.format(changed1);
            String formatted2 = df.format(changed2);
            String formatted3 = df.format(changed3);

            answer += formatted1 + " " + formatted2 + " " + formatted3;

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();

    }
}
