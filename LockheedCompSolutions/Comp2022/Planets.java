import java.util.Scanner;

public class Planets {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            double temp = Double.parseDouble(input[0]);
            boolean hasWater = input[1].equals("true");
            boolean hasMagnets = input[2].equals("true");
            double orbitCircularness = Double.parseDouble(input[3]);
            if (temp < 0.0) {
                answer += "The planet is too cold.";
            } else if (temp > 100) {
                answer += "The planet is too hot.";
            } else if (!hasWater) {
                answer += "The planet has no water.";
            } else if (!hasMagnets) {
                answer += "The planet has no magnetic field.";
            } else if (orbitCircularness > 0.6) {
                answer += "The planet's orbit is not ideal.";
            } else {
                answer += "The planet is habitable.";
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}