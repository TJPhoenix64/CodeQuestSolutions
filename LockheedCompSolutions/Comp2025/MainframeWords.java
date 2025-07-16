import java.math.BigInteger;
import java.util.Scanner;

public class MainframeWords {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int num = Integer.parseInt(sc.nextLine());
            String[] input = sc.nextLine().split(" ");
            boolean isValid = true;

            BigInteger topNum = BigInteger.valueOf(1).shiftLeft(num).subtract(BigInteger.ONE);
            for (String elem : input) {
                BigInteger currentNum = new BigInteger(elem);
                if (currentNum.max(topNum).equals(currentNum)) {
                    isValid = false;
                }
            }
            answer += topNum + " ";
            if (isValid) {
                answer += "TRUE";
            } else {
                answer += "FALSE";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
