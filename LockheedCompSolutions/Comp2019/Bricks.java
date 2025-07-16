import java.util.Scanner;

public class Bricks {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int oneInch = Integer.parseInt(inputArr[0]);
            int fiveInch = Integer.parseInt(inputArr[1]);
            int total = Integer.parseInt(inputArr[2]);
            int currentTotal = fiveInch * 5;
            int difference = total - currentTotal;
            while (difference < 0) {
                currentTotal -= 5;
                difference = total - currentTotal;
            }
            while (difference > 0 && oneInch > 0) {
                if (oneInch > 0) {
                    currentTotal++;
                    difference = total - currentTotal;
                    oneInch--;
                }
            }
            answer += difference == 0;

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}