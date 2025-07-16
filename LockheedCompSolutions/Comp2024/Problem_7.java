import java.text.DecimalFormat;
import java.util.Scanner;

//DONE
public class Problem_7 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < numCases; i++) {
            String answer = "";
            int width = sc.nextInt();
            int iterations = sc.nextInt();
            sc.nextLine();
            answer += Math.pow(3, iterations) + " ";
            double areaOG = width * width * 0.25 * Math.pow(3, 0.5);
            // System.out.println(areaOG);
            double newArea = areaOG * Math.pow(0.75, iterations);
            // System.out.println(newArea);
            // rounds to two decimal places and includes trailing zeros
            String roundedArea = df.format(newArea);
            answer += roundedArea;
            System.out.println(answer);
        }
        sc.close();
    }
}
