import java.util.Scanner;

public class RocketThrust {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            double num = Double.parseDouble(sc.nextLine());

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        answer += (int) ((2 * Math.PI * 6370000) / 86400);
        System.out.println(answer);
        sc.close();
    }
}
