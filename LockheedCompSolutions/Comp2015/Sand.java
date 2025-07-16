
import java.math.BigInteger;
import java.util.Scanner;

public class Sand {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numTeams = sc.nextInt();
            sc.nextLine();
            BigInteger total = BigInteger.ZERO;
            for (int k = 0; k < numTeams; k++) {
                String input = sc.nextLine();
                BigInteger num1 = new BigInteger(input);
                total = total.add(num1);
            }
            answer += total;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
