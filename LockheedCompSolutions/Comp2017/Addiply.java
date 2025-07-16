import java.util.Scanner;

public class Addiply {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(inputArr[0]);
            int num2 = Integer.parseInt(inputArr[1]);
            int add = num1 + num2;
            int mult = num1 * num2;
            answer += add + " " + mult;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();

    }
}
