import java.util.Scanner;

public class Operation {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            int solution = Integer.parseInt(input[2]);

            if (num1 + num2 == solution) {
                answer += "Addition";
            } else if (num1 - num2 == solution) {
                answer += "Subtraction";
            } else if (num1 / num2 == solution) {
                answer += "Division";
            } else if (num1 * num2 == solution) {
                answer += "Multiplication";
            } else if (num1 % num2 == solution) {
                answer += "Modulo";
            } else {
                answer += "IDK what to say";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
