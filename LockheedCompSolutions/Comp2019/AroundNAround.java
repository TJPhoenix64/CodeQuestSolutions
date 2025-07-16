import java.text.DecimalFormat;
import java.util.Scanner;

public class AroundNAround {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        int earthCircumf = 40075;
        String answer = "";
        DecimalFormat df = new DecimalFormat(".0");
        for (int i = 0; i < numCases; i++) {
            int orbitHeight = Integer.parseInt(sc.nextLine());
            double addedLength = Math.PI * 2.0 * orbitHeight;
            double total = earthCircumf + addedLength;
            double rounded = ((int) (total * 10 + 0.5)) / 10.0;
            answer += df.format(rounded);
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();

    }
}
