import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculus {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        DecimalFormat df = new DecimalFormat("#.###");
        for (int i = 0; i < numCases; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            double xInital = Double.parseDouble(inputArr[0]);
            double yInital = Double.parseDouble(inputArr[1]);
            double stepValue = Double.parseDouble(inputArr[2]);
            int numIterations = Integer.parseInt(inputArr[3]);
            double currentX = xInital;
            double currentY = yInital;
            for (int j = 0; j < numIterations; j++) {
                double derivative = 1;
                if (currentX != 0) {
                    derivative = (Math.sin(currentX) / currentX);
                }
                currentY += stepValue * derivative;
                currentX += stepValue;
            }
            answer += df.format(currentY);
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
