import java.util.Scanner;

public class Ellipses {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            double x1 = Double.parseDouble(input[0]);
            double y1 = Double.parseDouble(input[1]);
            double x2 = Double.parseDouble(input[2]);
            double y2 = Double.parseDouble(input[3]);
            double width = Double.parseDouble(input[4]);
            int numTestPoints = Integer.parseInt(input[5]);

            double leftPointX = (x2 + x1) / 2.0 - width / 2.0;
            double maxDistance = Math.sqrt((x1 - leftPointX) * (x1 - leftPointX))
                    + Math.sqrt((x2 - leftPointX) * (x2 - leftPointX));
            for (int j = 0; j < numTestPoints; j++) {
                String[] input1 = sc.nextLine().split(" ");
                double x = Double.parseDouble(input1[0]);
                double y = Double.parseDouble(input1[1]);
                double oneDistance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
                double twoDistance = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
                boolean isGood = oneDistance + twoDistance < maxDistance;
                if (isGood) {
                    answer += "1";
                } else {
                    answer += "0";
                }
                if (j + 1 != numTestPoints) {
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