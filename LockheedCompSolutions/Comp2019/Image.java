import java.util.Scanner;

public class Image {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numValues = Integer.parseInt(sc.nextLine());
            double max = -1;
            double min = 256;
            double[] values = new double[numValues];
            for (int k = 0; k < numValues; k++) {
                values[k] = Double.parseDouble(sc.nextLine());
                if (values[k] > max) {
                    max = values[k];
                }
                if (values[k] < min) {
                    min = values[k];
                }
            }
            double output;
            for (Double elem : values) {
                output = ((elem - min) / (max - min)) * 255.0;
                output = (int) (Math.round(output));
                answer += (int) output;
                if (elem != values[values.length - 1]) {
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
