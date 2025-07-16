
import java.util.Scanner;

public class NotSoDriving {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            double speed = Double.parseDouble(input.split(":")[0]);
            double distance = Double.parseDouble(input.split(":")[1]);
            double time = distance / speed;
            if (time <= 1) {
                answer += "SWERVE";
            } else if (time <= 5) {
                answer += "BRAKE";
            } else {
                answer += "SAFE";
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }

        }
        System.out.println(answer);
        sc.close();
    }
}
