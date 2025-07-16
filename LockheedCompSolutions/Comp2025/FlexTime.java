import java.util.Scanner;

public class FlexTime {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int total = 0;
            int numLines = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < numLines; j++) {
                String[] inputArr = sc.nextLine().split(" ");
                for (String nums : inputArr) {
                    int num = Integer.parseInt(nums);
                    total += num;
                }
            }
            answer += total - 40;

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}