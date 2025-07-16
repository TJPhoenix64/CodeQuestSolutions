import java.util.Scanner;

public class Gorillas {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int numHappy = 0;
            if ("true".equals(input[0])) {
                numHappy++;
            }
            if ("true".equals(input[1])) {
                numHappy++;
            }
            answer += (numHappy == 0 || numHappy == 2);
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
