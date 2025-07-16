import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static BigInteger calculateFactorial(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) < 0) {
            return BigInteger.ONE;
        }
        return calculateFactorial(num.subtract(BigInteger.ONE)).multiply(num);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            BigInteger num = new BigInteger(sc.nextLine());
            answer += calculateFactorial(num);
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}