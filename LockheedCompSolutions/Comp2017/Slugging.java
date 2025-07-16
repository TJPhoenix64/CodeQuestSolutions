import java.text.DecimalFormat;
import java.util.Scanner;

public class Slugging {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        DecimalFormat df = new DecimalFormat("0.000");
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(":");
            String name = inputArr[0];
            if (inputArr.length > 1) {
                String rest = inputArr[1];

                String[] notation = rest.split(",");
                int numAtBats = notation.length;
                double productivity = 0.0;
                for (int k = 0; k < notation.length; k++) {
                    String note = notation[k];
                    if (note.equals("K")) {
                    } else if (note.equals("BB")) {
                        numAtBats--;
                    } else if (note.equals("1B")) {
                        productivity++;
                    } else if (note.equals("2B")) {
                        productivity += 2;
                    } else if (note.equals("3B")) {
                        productivity += 3;
                    } else if (note.equals("HR")) {
                        productivity += 4;
                    }
                }
                double percent = productivity / numAtBats;
                double rounded = (int) (percent * 1000 + .5) / 1000.0;
                String num = df.format(rounded);

                answer += name + "=" + num;
            } else {
                answer += name + "=0.00";
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }

        }
        System.out.println(answer);
        sc.close();
    }
}
