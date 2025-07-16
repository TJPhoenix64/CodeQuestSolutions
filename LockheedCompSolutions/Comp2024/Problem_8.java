import java.text.DecimalFormat;
import java.util.Scanner;

//DONE
public class Problem_8 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < numCases; i++) {
            String answer;
            String input = sc.nextLine();
            String[] strArr = input.split(",");
            double[] numArr = new double[strArr.length];
            for (int j = 0; j < numArr.length; j++) {
                numArr[j] = Double.parseDouble(strArr[j]);
            }
            double V1 = numArr[0];
            double M1 = numArr[1];
            double V2 = numArr[2];
            double M2 = numArr[3];
            double numerator = M1 * V1 + M2 * V2;
            double denominator = M1 + M2;
            double velocity = numerator / denominator;
            String formattedVelo = df.format(velocity);
            answer = formattedVelo;
            System.out.println(answer);
        }
        sc.close();
    }
}
