
import java.text.DecimalFormat;
import java.util.Scanner;

public class Hot {

    public static String convertTemp(double temp, boolean isFahrenheit) {
        DecimalFormat df = new DecimalFormat("0.0");
        String answer = "";
        double newTemp;
        if (isFahrenheit) {
            newTemp = (5 / 9.0) * (temp - 32);
            if (newTemp < 0) {
                newTemp = Math.abs(newTemp);
                newTemp = ((int) (newTemp * 10) + .5) / 10.0;
                newTemp = -1 * newTemp;
            } else {
                newTemp = ((int) (newTemp * 10) + .5) / 10.0;
            }
            answer += df.format(newTemp) + " C";
        } else {
            newTemp = (9 / 5.0) * temp + 32;
            if (newTemp < 0) {
                newTemp = Math.abs(newTemp);
                newTemp = ((int) (newTemp * 10) + .5) / 10.0;
                newTemp = -1 * newTemp;
            } else {
                newTemp = ((int) (newTemp * 10) + .5) / 10.0;
            }
            answer += df.format(newTemp) + " F";
        }
        return answer;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numTemps = sc.nextInt();
            sc.nextLine();
            for (int k = 0; k < numTemps; k++) {
                double num = Double.parseDouble(sc.next());
                String scale = sc.next();
                sc.nextLine();
                answer += num + " " + scale + " = ";
                if (scale.equals("F")) {
                    answer += convertTemp(num, true);
                } else {
                    answer += convertTemp(num, false);
                }
                if (k + 1 != numTemps || i + 1 != numCases) {
                    answer += "\n";
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
