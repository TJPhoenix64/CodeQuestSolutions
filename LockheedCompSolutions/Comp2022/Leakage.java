import java.util.Scanner;

public class Leakage {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            double volume = Double.parseDouble(input[0]);
            double fillRate = Double.parseDouble(input[1]);
            double leakRate = Double.parseDouble(input[2]);

            double totalWaste = (volume / (fillRate - leakRate)) * leakRate;
            int rounded = (int) (Math.round(totalWaste));
            answer += rounded;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
