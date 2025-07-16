import java.util.Scanner;

public class Phonebook {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            String num = input[0];
            String type = input[1];

            switch (type) {
                case "PARENTHESES" ->
                    answer.append("(").append(num.substring(0, 3)).append(") ").append(num.substring(3, 6)).append("-")
                            .append(num.substring(6, 10));
                case "DASHES" -> answer.append(num.substring(0, 3)).append("-").append(num.substring(3, 6)).append("-")
                        .append(num.substring(6, 10));
                case "PERIODS" -> answer.append(num.substring(0, 3)).append(".").append(num.substring(3, 6)).append(".")
                        .append(num.substring(6, 10));

            }
            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}