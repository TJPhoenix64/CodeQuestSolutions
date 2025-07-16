import java.util.Scanner;

public class VirtualReality {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {

            String[] input = sc.nextLine().split(" ");
            double val1 = Double.parseDouble(input[0]);
            double val2 = Double.parseDouble(input[1]);
            double val3 = Double.parseDouble(input[2]);

            int quality = Integer.parseInt(input[3]);

            double targetFrameTime = 100.0 / 9.0;

            double lowThreshold = 0.7 * targetFrameTime;
            double extrapolateThreshold = 0.7 * targetFrameTime;
            double highThreshold = 0.7 * targetFrameTime;

            if (val3 > highThreshold) {
                quality -= 2;
            } else if (val3 > extrapolateThreshold) {
                double extrapolValue1 = val1 + ((3 / 2.0) * (val3 - val1));
                double extrapolValue2 = val2 + (2.0 * (val3 - val2));
                double finalVal = Math.max(extrapolValue1, extrapolValue2);
                if (finalVal > highThreshold) {
                    quality -= 2;
                }

            } else if (val1 < lowThreshold && val2 < lowThreshold && val3 < lowThreshold) {
                quality++;
            }

            if (quality < 1) {
                quality = 1;
            }
            if (quality > 10) {
                quality = 10;
            }

            answer.append(quality);

            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();

    }
}
