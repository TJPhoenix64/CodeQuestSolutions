import java.util.Scanner;

public class Bigger {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int maxNum = 0;
            for (String nums : inputArr) {
                int num = Integer.parseInt(nums);
                if (num > maxNum) {
                    maxNum = num;
                }
            }
            answer += maxNum;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
