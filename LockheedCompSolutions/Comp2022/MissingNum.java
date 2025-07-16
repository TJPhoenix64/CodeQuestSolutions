import java.util.Scanner;

public class MissingNum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int num = Integer.parseInt(sc.nextLine());
            String[] input = sc.nextLine().split(" ");
            int currentTotal = 0;
            int expectedTotal = num * (num + 1) / 2;
            for (String elem : input) {
                currentTotal += Integer.parseInt(elem);
            }
            answer += (expectedTotal - currentTotal);
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}