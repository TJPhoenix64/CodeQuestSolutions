import java.text.DecimalFormat;
import java.util.Scanner;

public class Mass {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            double density = Double.parseDouble(input[0]);
            double volume = Double.parseDouble(input[1]);
            double mass = density * volume;

            double rounded = Math.round(mass * 100) / 100.0;
            answer += df.format(rounded);
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}