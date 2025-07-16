import java.util.Scanner;

public class DecodeMessage {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        String input = sc.nextLine();
        for (int i = 0; i < numCases - 1; i++) {
            String[] words = sc.nextLine().split(" ");
            for (int j = 0; j < words.length; j++) {
                String elem = words[j];
                String[] letters = elem.split("-");
                for (String letter : letters) {
                    int idx = Integer.parseInt(letter) - 1;
                    answer.append(input.charAt(idx));
                }
                if (j + 1 != words.length) {
                    answer.append(" ");
                }
            }
            if (i + 1 != numCases - 1) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
